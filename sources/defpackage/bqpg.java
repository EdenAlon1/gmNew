package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqpg {
    public final bqph a;
    public final bqph b;
    public final bqph c;
    public final bqph d;
    final bqph[] e;

    public bqpg() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "cms_media_notifications._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqoy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqpw.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqoz
        };
        bqph bqphVar = new bqph(m.a());
        this.a = bqphVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "cms_media_notifications.message_cms_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqpa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqpw.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqpb
        };
        bqph bqphVar2 = new bqph(m2.a());
        this.b = bqphVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "cms_media_notifications.blob_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqpc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqpw.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqpd
        };
        bqph bqphVar3 = new bqph(m3.a());
        this.c = bqphVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        dtqsVar4.a = "cms_media_notifications.blob_type";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bqpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqpw.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqpf
        };
        bqph bqphVar4 = new bqph(m4.a());
        this.d = bqphVar4;
        this.e = new bqph[]{bqphVar, bqphVar2, bqphVar3, bqphVar4};
    }
}
