package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqht {
    public final bqhu a;
    public final bqhu b;
    public final bqhu c;
    final bqhu[] d;

    public bqht() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "cms_blobs_pending_delete._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqhn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqii.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqho
        };
        bqhu bqhuVar = new bqhu(m.a());
        this.a = bqhuVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "cms_blobs_pending_delete.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqhp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqii.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqhq
        };
        bqhu bqhuVar2 = new bqhu(m2.a());
        this.b = bqhuVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "cms_blobs_pending_delete.blob_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqhr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqii.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqhs
        };
        bqhu bqhuVar3 = new bqhu(m3.a());
        this.c = bqhuVar3;
        this.d = new bqhu[]{bqhuVar, bqhuVar2, bqhuVar3};
    }
}
