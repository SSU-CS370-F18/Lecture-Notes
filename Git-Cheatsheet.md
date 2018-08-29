# Git cheatsheet

_repository_: the directory containing a project's code, documentation, etc.  
_remote_: the online repository for a project. hosted on GitHub, BitBucket, etc.  
_commit_: a "savepoint" or snapshot of the repository's state at a certain time  
_branch_: an individual timeline of commits


## Starting a Project

### From Scratch
- `git init` creates a new Git repository in current directory
- create a remote repository to connect to using the website (github.com)
- `git remote add origin repositoryurl` connects local repository to web repository
- `git push -u origin master` after you've made at least one commit

### From Existing
- `git clone repositoryurl` downloads an existing project to the current directory


## Branches
Note: you should not have any _uncommitted_ changes when you run most of these commands.  
There is no guarantee they will not vanish if the command doesn't run smoothly.

### Switching Branches
- `git branch` lists the current branches, and shows which one you're on
- `git checkout -b branchname` creates a new branch by that name
- `git checkout branchname` switches to an existing branch
  - note: this may cause conflicts if you have _uncommitted_ changes on your current branch

### Combining Branches
- `git merge branchname` merges `branchname` __into__ the __current__ branch
  - you will want to be _on_ the branch you want to add the changes to
  - double check which branch you are on using `git branch` before merging
- There may be _merge conflicts_. You will need to go into each file and manually resolve the conflicts to complete the merge.
  - Once conflicts are resolved, make a new commit. Commonly known as a _merge commit_ and the commit message often looks similar to this:  
    "merged branchname into master"
- `git merge --abort` undoes a merge-in-progress and restores state to before the merge
  - any uncommitted changes from before the merge are almost certainly lost


## Working on a Branch

### Saving your Work
* `git status` shows all changed files, and whether or not they are staged (added) for commit
* `git add .` or `git add filenames` adds files to the ready-to-commit stage
* `git commit -m "commit message"` saves changes in all _staged_ files since the last commit
  - any files not staged with `git add` will not be saved in the commit
* `git push origin branchname` pushes all _committed_ local changes up to the remote
  - if this is a new branch (not yet on remote), add the `-u` flag to automatically have git track the new branch

### Updating or Restoring your Work
- `git fetch` syncs your local repository with the remote
  - does not change any files
- `git pull branchname` will pull down any changes from the remote, and apply them to your local branch
  - `git pull` with no `branchname` will do this for every local branch that is configured to track a remote branch
