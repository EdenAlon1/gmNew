package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class aquz {
    @ffbs
    public static String a(SelfIdentityId selfIdentityId) {
        if (selfIdentityId != null) {
            return selfIdentityId.c();
        }
        return null;
    }

    public static String b(SelfIdentityId selfIdentityId) {
        if (selfIdentityId != null) {
            return selfIdentityId.toString();
        }
        return null;
    }
}
