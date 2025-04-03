package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekqe {
    public final ejlc a;

    public ekqe(final eisx eisxVar, final eiyk eiykVar, final ejar ejarVar, final emxc emxcVar) {
        this.a = new ejlc(new erog() { // from class: ekqd
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ListenableFuture c = eiyk.this.c(eisxVar);
                final ejar ejarVar2 = ejarVar;
                final emxc emxcVar2 = emxcVar;
                return elfr.j(c, new emwl() { // from class: ekqc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        eixn eixnVar = (eixn) obj;
                        if (eixnVar.b().k.equals("pseudonymous")) {
                            return new evbx(null, "pseudonymous");
                        }
                        if (eixnVar.b().k.equals("incognito")) {
                            return new evbx(null, "incognito");
                        }
                        if (eixnVar.b().k.equals("google")) {
                            emxc emxcVar3 = emxcVar2;
                            ejar ejarVar3 = ejar.this;
                            emxf.m(true, "OAuth authentication failed because no @GcoreAccountType was bound");
                            emxf.r(((String) ((emxn) emxcVar3).a).equals(eixnVar.b().k), "OAuth authentication failed because account type did not match the @GcoreAccountType that was bound, @GcoreAccountType: %s, account: %s", eixnVar, emxcVar3);
                            String e = ejarVar3.e(eixnVar.b());
                            if (e != null) {
                                return new evbx(e, "google");
                            }
                            throw new IllegalStateException("Attempting to get context for unrecognized account type: ".concat(String.valueOf(eixnVar.b().k)));
                        }
                        String str = eixnVar.b().d;
                        String str2 = eixnVar.b().k;
                        int length = str2.length();
                        boolean z = false;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = true;
                                break;
                            }
                            int codePointAt = str2.codePointAt(i);
                            if (!Character.isWhitespace(codePointAt)) {
                                break;
                            }
                            i += Character.charCount(codePointAt);
                        }
                        emxf.b(!z, "Custom AuthContext type must not be empty");
                        emxf.f(!str2.equals("google"), "Custom AuthContext type must not be '%s'", "google");
                        emxf.f(!str2.equals("pseudonymous"), "Custom AuthContext type must not be '%s'", "pseudonymous");
                        emxf.f(!str2.equals("incognito"), "Custom AuthContext type must not be '%s'", "incognito");
                        return new evbx(str, str2);
                    }
                }, erpp.a);
            }
        }, erpp.a);
    }
}
