package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqry extends dtrr {
    public long a;
    public long b;
    public String c;
    public String d;
    public eshn e;
    public byte[] f;
    public long g;

    public bqry() {
        super(bqth.e());
        this.e = eshn.CMS_DATA_PROVIDER_UNSPECIFIED;
    }

    public final bqrw a() {
        bqrx bqrxVar = new bqrx();
        bqrxVar.aC(aB());
        bqrxVar.a = this.a;
        bqrxVar.b = this.b;
        bqrxVar.c = this.c;
        bqrxVar.d = this.d;
        bqrxVar.e = this.e;
        bqrxVar.f = this.f;
        bqrxVar.g = this.g;
        bqrxVar.cK = aC();
        return bqrxVar;
    }

    public final void b(eshn eshnVar) {
        int i = this.aB;
        if (i < 59660) {
            dtub.w("cms_data_provider_type", i);
        }
        aE(4);
        this.e = eshnVar;
    }

    public final void c(String str) {
        aE(3);
        this.d = str;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }

    public final void e(long j) {
        aE(1);
        this.b = j;
    }

    public final void f(long j) {
        aE(6);
        this.g = j;
    }

    public final void g(byte[] bArr) {
        aE(5);
        this.f = bArr;
    }
}
