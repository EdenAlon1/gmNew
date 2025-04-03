package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeuj implements eeui {
    public String a;
    private final Context b;
    private final eumd c;
    private final dfld d;
    private final dfmc e;

    public eeuj(Context context, eumd eumdVar, dfld dfldVar, dfmc dfmcVar) {
        this.b = context;
        this.c = eumdVar;
        this.d = dfldVar;
        this.e = dfmcVar;
    }

    private static final boolean k(String str) {
        return str.contains("/stickers/");
    }

    @Override // defpackage.eeui
    public final void a(String str, eumg eumgVar) {
        if (k(str)) {
            String c = eerv.c(str);
            h(25, c, str);
            str = c;
        }
        eumi eumiVar = (eumi) eumj.a.createBuilder();
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).b = eumh.a(25);
        eumiVar.copyOnWrite();
        eumj eumjVar = (eumj) eumiVar.instance;
        str.getClass();
        eumjVar.d = str;
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).e = eumgVar.a();
        g((eumj) eumiVar.build());
    }

    @Override // defpackage.eeui
    public final void b(String str, eumg eumgVar, boolean z) {
        eumi eumiVar = (eumi) eumj.a.createBuilder();
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).b = eumh.a(true != z ? 11 : 10);
        eumiVar.copyOnWrite();
        eumj eumjVar = (eumj) eumiVar.instance;
        str.getClass();
        eumjVar.d = str;
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).e = eumgVar.a();
        g((eumj) eumiVar.build());
    }

    @Override // defpackage.eeui
    public final void c(String str, eumg eumgVar) {
        if (k(str)) {
            String c = eerv.c(str);
            h(13, c, str);
            str = c;
        }
        eumi eumiVar = (eumi) eumj.a.createBuilder();
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).b = eumh.a(13);
        eumiVar.copyOnWrite();
        eumj eumjVar = (eumj) eumiVar.instance;
        str.getClass();
        eumjVar.d = str;
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).e = eumgVar.a();
        g((eumj) eumiVar.build());
    }

    @Override // defpackage.eeui
    public final void d() {
        eumi eumiVar = (eumi) eumj.a.createBuilder();
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).b = eumh.a(41);
        g((eumj) eumiVar.build());
    }

    @Override // defpackage.eeui
    public final void e() {
        eumi eumiVar = (eumi) eumj.a.createBuilder();
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).b = eumh.a(42);
        g((eumj) eumiVar.build());
    }

    @Override // defpackage.eeui
    public final void f(int i) {
        eumi eumiVar = (eumi) eumj.a.createBuilder();
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).b = eumh.a(43);
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).f = i - 2;
        g((eumj) eumiVar.build());
    }

    public final void g(eumj eumjVar) {
        if (Log.isLoggable("StickerLogger", 3)) {
            Log.d("StickerLogger", "log: ".concat(String.valueOf(String.valueOf(eumjVar))));
        }
        dfld dfldVar = this.d;
        String b = emxe.b(this.a);
        eeuk eeukVar = new eeuk();
        eume eumeVar = (eume) eumf.a.createBuilder();
        eumd eumdVar = this.c;
        eumeVar.copyOnWrite();
        eumf eumfVar = (eumf) eumeVar.instance;
        eumfVar.c = eumdVar;
        eumfVar.b |= 1;
        eumi eumiVar = (eumi) eumj.a.createBuilder(eumjVar);
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).c = b;
        eumeVar.copyOnWrite();
        eumf eumfVar2 = (eumf) eumeVar.instance;
        eumj eumjVar2 = (eumj) eumiVar.build();
        eumjVar2.getClass();
        eumfVar2.d = eumjVar2;
        eumfVar2.b |= 4;
        dflc i = dfldVar.i(eumeVar.build());
        i.k = "EXPRESSION";
        i.q = dtql.b(this.b, eeukVar);
        i.c();
    }

    final void h(int i, String str, String str2) {
        String str3;
        int parseInt = Integer.parseInt(str.substring(str.lastIndexOf(47) + 1));
        int parseInt2 = Integer.parseInt(str2.substring(str2.lastIndexOf(47) + 1));
        emvf emvfVar = emvf.e;
        emvf emvfVar2 = emvf.d;
        switch (i) {
            case 13:
                str3 = "STICKER_SENT";
                break;
            case 14:
                str3 = "STICKER_SHARED";
                break;
            case 15:
            default:
                str3 = "CLICKED_PLAY_STORE";
                break;
            case 16:
                str3 = "PACK_DETAIL_OPENED";
                break;
            case 17:
                str3 = "CLIENT_PICKER_FAVORITES_OPENED";
                break;
            case 18:
                str3 = "OPEN_BROWSE";
                break;
            case 19:
                str3 = "OPEN_FAVORITES";
                break;
            case 20:
                str3 = "OPEN_SEARCH";
                break;
            case 21:
                str3 = "SEARCH_REQUEST_SENT";
                break;
            case 22:
                str3 = "SEARCH_REQUEST_SUCCESS";
                break;
            case 23:
                str3 = "SEARCH_REQUEST_ERROR";
                break;
            case 24:
                str3 = "OPEN_PACK_DETAIL";
                break;
            case 25:
                str3 = "STICKER_ATTACHED";
                break;
        }
        emvfVar2.getClass();
        if (emvfVar2 != emvfVar) {
            if (emvfVar2 == emve.a) {
                str3 = emuz.c(str3.replace('_', '-'));
            } else if (emvfVar2 == emve.b) {
                str3 = emuz.c(str3);
            } else {
                StringBuilder sb = null;
                int i2 = 0;
                int i3 = -1;
                while (true) {
                    i3 = emvfVar.f.e(str3, i3 + 1);
                    if (i3 != -1) {
                        if (i2 == 0) {
                            StringBuilder sb2 = new StringBuilder(str3.length() + (emvfVar2.g.length() * 4));
                            sb2.append(emvfVar2.a(str3.substring(0, i3)));
                            sb = sb2;
                        } else {
                            sb.getClass();
                            sb.append(emvfVar2.a(str3.substring(i2, i3)));
                        }
                        sb.append(emvfVar2.g);
                        i2 = emvfVar.g.length() + i3;
                    } else if (i2 == 0) {
                        str3 = emvfVar2.a(str3);
                    } else {
                        sb.getClass();
                        sb.append(emvfVar2.a(str3.substring(i2)));
                        str3 = sb.toString();
                    }
                }
            }
        }
        euma eumaVar = (euma) eumb.a.createBuilder();
        int b = eulz.b(this.c.b);
        if (b == 0) {
            b = 1;
        }
        eumaVar.copyOnWrite();
        ((eumb) eumaVar.instance).d = eulz.a(b);
        eumaVar.copyOnWrite();
        ((eumb) eumaVar.instance).b = 1;
        eumaVar.copyOnWrite();
        ((eumb) eumaVar.instance).c = parseInt;
        eumb eumbVar = (eumb) eumaVar.build();
        dflz e = this.e.e(str3);
        dflv a = dflv.a(eumbVar);
        dflt dfltVar = e.f;
        e.a(parseInt2, 1L, a);
        this.e.f();
    }

    public final void i(int i) {
        eumi eumiVar = (eumi) eumj.a.createBuilder();
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).b = eumh.a(i);
        g((eumj) eumiVar.build());
    }

    public final void j(String str) {
        eumi eumiVar = (eumi) eumj.a.createBuilder();
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).b = eumh.a(16);
        eumiVar.copyOnWrite();
        eumj eumjVar = (eumj) eumiVar.instance;
        str.getClass();
        eumjVar.d = str;
        g((eumj) eumiVar.build());
    }
}
