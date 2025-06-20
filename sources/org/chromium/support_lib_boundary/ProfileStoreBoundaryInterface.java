package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface ProfileStoreBoundaryInterface {
    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    InvocationHandler getOrCreateProfile(String str);

    InvocationHandler getProfile(String str);
}
