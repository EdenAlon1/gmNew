package defpackage;

import java.security.Principal;
import org.apache.http.auth.Credentials;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class disl implements Credentials {
    public static final /* synthetic */ int a = 0;

    @Override // org.apache.http.auth.Credentials
    public abstract String getPassword();

    @Override // org.apache.http.auth.Credentials
    public abstract Principal getUserPrincipal();
}
