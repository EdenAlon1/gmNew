package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebpy {
    public static final String a = "ebpy";
    public final fr b;
    public final eg c;
    private final Context d;
    private final ebpp e;

    public ebpy(Context context, fr frVar, ebpp ebppVar, eg egVar) {
        this.d = context.getApplicationContext();
        this.b = frVar;
        this.e = ebppVar;
        this.c = egVar;
        ebpx b = b(frVar);
        if (b != null) {
            a(b);
        }
    }

    public static final ebpx b(fr frVar) {
        return (ebpx) frVar.h(a);
    }

    public final void a(ebpx ebpxVar) {
        ebpj ebpjVar = (ebpj) this.e;
        ebpxVar.ai = ebpjVar.a;
        ebry ebryVar = ebpjVar.b;
        ebpn ebpnVar = (ebpn) ebryVar;
        if (((ebsc) ebpnVar.b).e.g()) {
            ebpxVar.am = ((ebsm) ((ebsc) ebpnVar.b).e.c()).a;
        } else {
            Context context = this.d;
            ebpxVar.am = new Runnable() { // from class: ebpq
                @Override // java.lang.Runnable
                public final void run() {
                }
            };
            ebpm ebpmVar = new ebpm(ebryVar);
            ebsb ebsbVar = new ebsb(ebpnVar.b);
            ebsbVar.b(ebsn.a(context, ebpxVar.am));
            ebpmVar.b = ebsbVar.e();
            ebryVar = ebpmVar.a();
        }
        ebpxVar.aj = ebryVar;
        ebpxVar.al = true;
        ebpxVar.ag.b();
    }
}
