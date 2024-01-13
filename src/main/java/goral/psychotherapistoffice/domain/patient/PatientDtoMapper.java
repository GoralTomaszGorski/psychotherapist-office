package goral.psychotherapistoffice.domain.patient;

import goral.psychotherapistoffice.domain.patient.dto.PatientDto;

public class PatientDtoMapper {

    static PatientDto map(Patient patient){
        return new PatientDto(
                patient.getId(),
                patient.getNick(),
                patient.getName(),
                patient.getSurname(),
                patient.getTelephone(),
                patient.getYearOfBrith()
        );
    }
}
