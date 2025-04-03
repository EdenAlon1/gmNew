package defpackage;

import android.util.Base64;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edbk {
    public static final edax a(String str, boolean z, String str2, Set set, boolean z2, boolean z3, boolean z4) {
        return new edax(str2, str, (Object) false, (ecyy) new ecyp(true, z3, false, set, new edbf(), new edbg(Boolean.class)));
    }

    @Deprecated
    public static final edax b(String str, String str2, String str3, Set set, boolean z, boolean z2, boolean z3) {
        return new edax("com.google.android.libraries.notifications.platform", "__phenotype_server_token", "", new ecyp(true, false, false, set, new edbj() { // from class: edba
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (String) obj;
            }
        }, new edbi(String.class)), false);
    }

    public static final edax c(String str, double d, String str2, Set set, boolean z, boolean z2, boolean z3) {
        Double valueOf = Double.valueOf(d);
        final Class<Double> cls = Double.class;
        return new edax("com.google.android.libraries.user.profile.photopicker", str, valueOf, new ecyp(true, false, false, set, new edbj() { // from class: edbb
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return Double.valueOf(Double.parseDouble((String) obj));
            }
        }, new edbj() { // from class: edbc
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (Double) cls.cast(obj);
            }
        }), true);
    }

    public static final edax d(String str, long j, String str2, Set set, boolean z, boolean z2, boolean z3) {
        final Class<Long> cls = Long.class;
        return new edax(str2, str, Long.valueOf(j), new ecyp(true, z2, false, set, new edbj() { // from class: eday
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return Long.valueOf(Long.parseLong((String) obj));
            }
        }, new edbj() { // from class: edaz
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (Long) cls.cast(obj);
            }
        }), true);
    }

    public static final edax e(String str, String str2, String str3, Set set, boolean z, boolean z2, boolean z3) {
        return new edax(str3, str, str2, new ecyp(true, false, false, set, new edbj() { // from class: edbh
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (String) obj;
            }
        }, new edbi(String.class)), true);
    }

    public static final edax f(String str, boolean z, String str2, Set set, boolean z2, boolean z3, boolean z4) {
        return new edax(str2, str, Boolean.valueOf(z), new ecyp(z2, z3, z4, set, new edbf(), new edbg(Boolean.class)), true);
    }

    public static final edax g(String str, final edbj edbjVar, String str2, String str3, Set set, boolean z, boolean z2, boolean z3) {
        return new edax(str3, str, new ecyp(true, z2, false, set, new edbj() { // from class: edbd
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return edbj.this.a(Base64.decode((String) obj, 3));
            }
        }, new edbj() { // from class: edbe
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return edbj.this.a((byte[]) obj);
            }
        }), str2);
    }
}
