description "showing an pending story: simple account manipulation"
scenario "increasing an empty account", {
	given "an empty account"
	when "500 is added"
	and "200 is removed"
	then "the balance should be 300"
}