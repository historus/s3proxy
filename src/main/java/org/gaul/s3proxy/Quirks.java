/*
 * Copyright 2014-2016 Andrew Gaul <andrew@gaul.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gaul.s3proxy;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

final class Quirks {
    /** Blobstores which do not support blob-level access control. */
    static final Set<String> NO_BLOB_ACCESS_CONTROL = ImmutableSet.of(
            "azureblob",
            "rackspace-cloudfiles-uk",
            "rackspace-cloudfiles-us",
            "openstack-swift"
    );

    /** Blobstores which do not support the Cache-Control header. */
    static final Set<String> NO_CACHE_CONTROL_SUPPORT = ImmutableSet.of(
            "atmos",
            "google-cloud-storage",
            "rackspace-cloudfiles-uk",
            "rackspace-cloudfiles-us",
            "openstack-swift"
    );

    /** Blobstores which do not support the Content-Encoding header. */
    static final Set<String> NO_CONTENT_ENCODING = ImmutableSet.of(
            "google-cloud-storage"
    );

    /** Blobstores which do not support the Content-Language header. */
    static final Set<String> NO_CONTENT_LANGUAGE = ImmutableSet.of(
            "rackspace-cloudfiles-uk",
            "rackspace-cloudfiles-us",
            "openstack-swift"
    );

    /** Blobstores which do not support the If-None-Match header during copy. */
    static final Set<String> NO_COPY_IF_NONE_MATCH = ImmutableSet.of(
            "openstack-swift",
            "rackspace-cloudfiles-uk",
            "rackspace-cloudfiles-us"
    );

    static final Set<String> NO_EXPIRES = ImmutableSet.of(
            "azureblob"
    );

    /** Blobstores which do not allow listing zero keys. */
    static final Set<String> NO_LIST_ZERO_KEYS = ImmutableSet.of(
            "atmos",
            "azureblob"
    );

    /** Blobstores with opaque ETags. */
    static final Set<String> OPAQUE_ETAG = ImmutableSet.of(
            "azureblob",
            "google-cloud-storage"
    );

    /** Blobstores with opaque markers. */
    static final Set<String> OPAQUE_MARKERS = ImmutableSet.of(
            "azureblob",
            "google-cloud-storage"
    );

    private Quirks() {
        throw new AssertionError("Intentionally unimplemented");
    }
}
