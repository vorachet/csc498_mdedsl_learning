/*
 * generated by Xtext 2.22.0
 */
package csc498.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDsl2Validator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(csc498.dsl2.Dsl2Package.eINSTANCE);
		return result;
	}
}
