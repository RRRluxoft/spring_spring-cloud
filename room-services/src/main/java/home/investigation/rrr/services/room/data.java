package home.investigation.rrr.services.room;

import org.derive4j.Data;
import org.derive4j.Derive;
import org.derive4j.Flavour;
import org.derive4j.Make;
import org.derive4j.Visibility;

/**
 * Date: 01.04.2018
 */
@Data(flavour = Flavour.FJ, value = @Derive(inClass = "{ClassName}Impl", withVisibility = Visibility.Package, make = {
    Make.constructors, Make.casesMatching }))
public @interface data {
}