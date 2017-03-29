/**
 * Created by daniel.rocha on 29/03/2017.
 */

import spock.lang.*

@Unroll
class HelloSpockSpec extends Specification {

    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }

}