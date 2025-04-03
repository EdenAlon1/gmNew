package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btpq {
    public final btpr a;
    public final btpr b;
    public final btpr c;
    public final btpr d;
    public final btpr e;
    public final btpr f;
    public final btpr g;
    public final btpr h;
    public final btpr i;
    public final btpr j;
    public final btpr k;
    final btpr[] l;

    public btpq() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "link_preview._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btot
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqq.c();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btov
        };
        btpr btprVar = new btpr(m.a());
        this.a = btprVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: btoz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "link_preview.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: btpa
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqq.c();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: btpb
        };
        btpr btprVar2 = new btpr(m2.a());
        this.b = btprVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.k(true);
        dtqsVar3.a = "link_preview.trigger_url";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: btpc
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqq.c();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btpd
        };
        btpr btprVar3 = new btpr(m3.a());
        this.c = btprVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "link_preview.expiration_time_millis";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: btpf
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqq.c();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: btpg
        };
        btpr btprVar4 = new btpr(m4.a());
        this.d = btprVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "link_preview.link_title";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: btph
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqq.c();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: btpe
        };
        btpr btprVar5 = new btpr(m5.a());
        this.e = btprVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "link_preview.link_description";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: btpi
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqq.c();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: btpj
        };
        btpr btprVar6 = new btpr(m6.a());
        this.f = btprVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "link_preview.link_image_url";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: btpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqq.c();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: btpl
        };
        btpr btprVar7 = new btpr(m7.a());
        this.g = btprVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 4;
        dtqsVar8.a = "link_preview.link_domain";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: btpm
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqq.c();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: btpn
        };
        btpr btprVar8 = new btpr(m8.a());
        this.h = btprVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        dtqsVar9.a = "link_preview.link_canonical_url";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: btpo
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqq.c();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: btpp
        };
        btpr btprVar9 = new btpr(m9.a());
        this.i = btprVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 2;
        dtqsVar10.a = "link_preview.link_preview_prevented";
        m10.i(21010);
        dtqsVar10.d = new Supplier() { // from class: btou
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqq.c();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: btow
        };
        btpr btprVar10 = new btpr(m10.a());
        this.j = btprVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 2;
        dtqsVar11.a = "link_preview.link_preview_failed";
        m11.i(22020);
        dtqsVar11.d = new Supplier() { // from class: btox
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqq.c();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: btoy
        };
        btpr btprVar11 = new btpr(m11.a());
        this.k = btprVar11;
        this.l = new btpr[]{btprVar, btprVar2, btprVar3, btprVar4, btprVar5, btprVar6, btprVar7, btprVar8, btprVar9, btprVar10, btprVar11};
    }
}
