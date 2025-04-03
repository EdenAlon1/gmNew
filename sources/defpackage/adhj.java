package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adhj {
    public static final Optional a(String str, String str2) {
        return Optional.ofNullable(FirebaseInstanceId.b().i(str, str2));
    }
}
