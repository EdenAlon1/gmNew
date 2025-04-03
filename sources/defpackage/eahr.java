package defpackage;

import android.content.Intent;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eahr {
    public static eahr j(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("rawData");
        String stringExtra = intent.getStringExtra("casp");
        String stringExtra2 = intent.getStringExtra("chm");
        int n = n(intent.getStringExtra("google.original_priority"));
        int n2 = n(intent.getStringExtra("google.delivered_priority"));
        int m = m(intent.getStringExtra("message_type"));
        String stringExtra3 = intent.getStringExtra("ki");
        Integer valueOf = !intent.hasExtra("google.ttl") ? null : Integer.valueOf(intent.getIntExtra("google.ttl", 0));
        Integer num = valueOf == null ? null : valueOf;
        String stringExtra4 = intent.getStringExtra("google.message_id");
        return new eahn(true != TextUtils.isEmpty(stringExtra4) ? stringExtra4 : null, m, n, n2, num, stringExtra, byteArrayExtra, stringExtra2, stringExtra3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int m(String str) {
        char c;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case -2062414158:
                if (str.equals("deleted_messages")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 102161:
                if (str.equals("gcm")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 814694033:
                if (str.equals("send_error")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 814800675:
                if (str.equals("send_event")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 2;
        }
        if (c == 1) {
            return 3;
        }
        if (c != 2) {
            return c != 3 ? 1 : 5;
        }
        return 4;
    }

    private static int n(String str) {
        char c;
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1039745817) {
            if (hashCode == 3202466 && str.equals("high")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("normal")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            return c != 1 ? 1 : 3;
        }
        return 2;
    }

    private static int o(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? 1 : 3;
        }
        return 2;
    }

    public abstract Integer a();

    protected abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract byte[] f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public final exrt k() {
        exrq exrqVar = (exrq) exrt.a.createBuilder();
        int o = o(i());
        exrqVar.copyOnWrite();
        exrt exrtVar = (exrt) exrqVar.instance;
        exrtVar.e = o - 1;
        int i = 4;
        exrtVar.b |= 4;
        int o2 = o(h());
        exrqVar.copyOnWrite();
        exrt exrtVar2 = (exrt) exrqVar.instance;
        exrtVar2.f = o2 - 1;
        exrtVar2.b |= 8;
        int g = g() - 1;
        if (g == 1) {
            i = 2;
        } else if (g == 2) {
            i = 3;
        } else if (g != 3) {
            i = g != 4 ? 1 : 5;
        }
        exrqVar.copyOnWrite();
        exrt exrtVar3 = (exrt) exrqVar.instance;
        exrtVar3.d = i - 1;
        exrtVar3.b = 2 | exrtVar3.b;
        if (!TextUtils.isEmpty(e())) {
            String e = e();
            exrqVar.copyOnWrite();
            exrt exrtVar4 = (exrt) exrqVar.instance;
            e.getClass();
            exrtVar4.b |= 1;
            exrtVar4.c = e;
        }
        return (exrt) exrqVar.build();
    }

    public final boolean l() {
        return ealq.a(c(), f(), b());
    }
}
