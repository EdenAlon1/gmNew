package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aweu {
    public final awev a;
    public final awev b;
    public final awev c;
    public final awev d;
    public final awev e;
    public final awev f;
    public final awev g;
    public final awev h;
    final awev[] i;

    public aweu() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "file_processing.processing_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: awee
            @Override // java.util.function.Supplier
            public final Object get() {
                return awfq.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: awer
        };
        awev awevVar = new awev(m.a());
        this.a = awevVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.g(true);
        m2.d(true);
        dtqsVar2.a = "file_processing.file_type";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: awes
            @Override // java.util.function.Supplier
            public final Object get() {
                return awfq.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: awet
        };
        awev awevVar2 = new awev(m2.a());
        this.b = awevVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "file_processing.file_uri";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: awef
            @Override // java.util.function.Supplier
            public final Object get() {
                return awfq.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: aweg
        };
        awev awevVar3 = new awev(m3.a());
        this.c = awevVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 5;
        dtqsVar4.a = "file_processing.content_type";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: aweh
            @Override // java.util.function.Supplier
            public final Object get() {
                return awfq.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: awei
        };
        awev awevVar4 = new awev(m4.a());
        this.d = awevVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 5;
        dtqsVar5.a = "file_processing.encryption_metadata";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: awej
            @Override // java.util.function.Supplier
            public final Object get() {
                return awfq.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: awek
        };
        awev awevVar5 = new awev(m5.a());
        this.e = awevVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "file_processing.transfer_handle";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: awel
            @Override // java.util.function.Supplier
            public final Object get() {
                return awfq.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: awem
        };
        awev awevVar6 = new awev(m6.a());
        this.f = awevVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 5;
        dtqsVar7.a = "file_processing.upload_result";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: awen
            @Override // java.util.function.Supplier
            public final Object get() {
                return awfq.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: aweo
        };
        awev awevVar7 = new awev(m7.a());
        this.g = awevVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 5;
        dtqsVar8.a = "file_processing.mls_file_metadata";
        m8.i(60700);
        dtqsVar8.d = new Supplier() { // from class: awep
            @Override // java.util.function.Supplier
            public final Object get() {
                return awfq.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: aweq
        };
        awev awevVar8 = new awev(m8.a());
        this.h = awevVar8;
        this.i = new awev[]{awevVar, awevVar2, awevVar3, awevVar4, awevVar5, awevVar6, awevVar7, awevVar8};
    }
}
