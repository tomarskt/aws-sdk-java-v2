package software.amazon.awssdk.services.jsonprotocoltests.model;

import static java.util.stream.Collectors.toMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.core.adapter.StandardMemberCopier;

@Generated("software.amazon.awssdk:codegen")
final class BlobMapTypeCopier {
    static Map<String, SdkBytes> copy(Map<String, SdkBytes> blobMapTypeParam) {
        if (blobMapTypeParam == null) {
            return null;
        }
        Map<String, SdkBytes> blobMapTypeParamCopy = blobMapTypeParam.entrySet().stream()
            .collect(HashMap::new, (m, e) -> m.put(e.getKey(), StandardMemberCopier.copy(e.getValue())), HashMap::putAll);
        return Collections.unmodifiableMap(blobMapTypeParamCopy);
    }
}
