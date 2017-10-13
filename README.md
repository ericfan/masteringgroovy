In Groovy, non-zero integers,
non-null values, nonempty strings, initialized collections, and a valid matcher are
evaluated as Boolean true values. This is known as Groovy Truths

## CLOSURE Strategy
### DELEGATE_FIRST
the closure will try to resolve the property or methods to the delegate first and then the owner.
### OWNER_ONLY
It attempts to resolve the property or methods within the owner only and doesn't delegate
### DELEGATE_ONLY
Closure will resolve the property references or methods to the delegate. It completely ignores the owner
### TO_SELF
It will resolve the property references or methods to itself and go through the usual MetaClass look-up process
