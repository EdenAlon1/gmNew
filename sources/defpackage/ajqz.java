package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajqz {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ffbz g;
    public final ffbz h;
    private final ffbz i;

    public ajqz(ParticipantsTable.BindData bindData) {
        String S = bindData.S();
        S.getClass();
        int r = bindData.r();
        String U = bindData.U();
        String P = bindData.P();
        String R = bindData.R();
        String Q = bindData.Q();
        this.a = S;
        this.b = r;
        this.c = U;
        this.d = P;
        this.e = R;
        this.f = Q;
        this.g = ffca.a(new ffix() { // from class: ajqw
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(ajqz.this.b != -2);
            }
        });
        this.h = ffca.a(new ffix() { // from class: ajqx
            @Override // defpackage.ffix
            public final Object invoke() {
                ajqz ajqzVar = ajqz.this;
                String str = ajqzVar.e;
                String str2 = null;
                if (str != null) {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        return str;
                    }
                }
                String str3 = ajqzVar.f;
                if (str3 == null || str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 != null) {
                    return str3;
                }
                String str4 = ajqzVar.d;
                if (str4 != null && str4.length() > 0) {
                    str2 = str4;
                }
                if (str2 != null) {
                    return str2;
                }
                String str5 = ajqzVar.c;
                return str5 == null ? "" : str5;
            }
        });
        this.i = ffca.a(new ffix() { // from class: ajqy
            @Override // defpackage.ffix
            public final Object invoke() {
                ajrv ajrvVar = (ajrv) ajrw.a.createBuilder();
                ajrvVar.getClass();
                ajqz ajqzVar = ajqz.this;
                if (((Boolean) ajqzVar.g.a()).booleanValue()) {
                    ajrx.c(3, ajrvVar);
                } else {
                    ajsl ajslVar = (ajsl) ajsm.a.createBuilder();
                    ajslVar.getClass();
                    String str = (String) ajqzVar.h.a();
                    str.getClass();
                    ajslVar.copyOnWrite();
                    ((ajsm) ajslVar.instance).b = str;
                    String str2 = ajqzVar.a;
                    ajslVar.copyOnWrite();
                    ((ajsm) ajslVar.instance).c = str2;
                    eyfy build = ajslVar.build();
                    build.getClass();
                    ajrvVar.copyOnWrite();
                    ajrw ajrwVar = (ajrw) ajrvVar.instance;
                    ajrwVar.c = (ajsm) build;
                    ajrwVar.b = 3;
                }
                return ajrx.a(ajrvVar);
            }
        });
    }

    public final ajrw a() {
        return (ajrw) this.i.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajqz)) {
            return false;
        }
        ajqz ajqzVar = (ajqz) obj;
        return ffkj.e(this.a, ajqzVar.a) && this.b == ajqzVar.b && ffkj.e(this.c, ajqzVar.c) && ffkj.e(this.d, ajqzVar.d) && ffkj.e(this.e, ajqzVar.e) && ffkj.e(this.f, ajqzVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (((hashCode + this.b) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "Participant(id=" + this.a + ", subId=" + this.b + ", normalizedDestination=" + this.c + ", displayDestination=" + this.d + ", fullName=" + this.e + ", firstName=" + this.f + ")";
    }
}
