package defpackage;

import com.android.vcard.VCardBuilder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eelv {
    protected static final String b = StandardCharsets.UTF_8.name();
    public eekt e;
    public eell f;
    public eekg g;
    protected eekh h;
    public eekn i;
    public eekj j;
    public byte[] k;
    public final int l;
    public final long c = System.currentTimeMillis();
    public final List d = new ArrayList();
    private final Map a = new HashMap();

    public eelv(int i) {
        this.l = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w(defpackage.eeku r4, boolean r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eelv.w(eeku, boolean, boolean):void");
    }

    private final void x(StringBuffer stringBuffer) {
        synchronized (this.d) {
            for (eeku eekuVar : this.d) {
                if (!(eekuVar instanceof eekn)) {
                    stringBuffer.append(eekuVar.c());
                }
            }
        }
    }

    public String a() {
        StringBuffer stringBuffer = new StringBuffer();
        l(stringBuffer);
        return stringBuffer.toString();
    }

    public byte[] b() {
        StringBuffer stringBuffer = new StringBuffer();
        x(stringBuffer);
        byte[] bArr = this.k;
        if (bArr == null) {
            stringBuffer.append("Content-Length: 0\r\n");
            stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
            return stringBuffer.toString().getBytes(StandardCharsets.UTF_8);
        }
        stringBuffer.append("Content-Length: ");
        int length = bArr.length;
        stringBuffer.append(length);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        byte[] bytes = stringBuffer.toString().getBytes(StandardCharsets.UTF_8);
        if (bytes == null) {
            return null;
        }
        int length2 = bytes.length;
        byte[] bArr2 = new byte[length2 + length];
        System.arraycopy(bytes, 0, bArr2, 0, length2);
        System.arraycopy(bArr, 0, bArr2, length2, length);
        return bArr2;
    }

    public final eekl c() {
        return (eekl) e("Contact");
    }

    public final eeku d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null");
        }
        eeku eekuVar = (eeku) this.a.get(str.toLowerCase(Locale.US));
        return eekuVar instanceof eekv ? ((eekv) eekuVar).f() : eekuVar;
    }

    public final eekv e(String str) {
        eeku eekuVar = (eeku) this.a.get(str.toLowerCase(Locale.US));
        return eekuVar instanceof eekv ? (eekv) eekuVar : eekuVar instanceof eelo ? new eelp((eelo) eekuVar) : eekuVar instanceof eekk ? new eekl((eekk) eekuVar) : eekuVar == null ? str.equals("Contact") ? new eekl() : str.equals("Via") ? new eelp() : new eekv(str) : new eekv(eekuVar);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eelv)) {
            return false;
        }
        eelv eelvVar = (eelv) obj;
        if (this.l != eelvVar.l) {
            return false;
        }
        if (eelvVar.d.size() != this.d.size()) {
            return false;
        }
        if ((this.k == null && eelvVar.k != null) || !eelvVar.d.equals(this.d)) {
            return false;
        }
        byte[] bArr = this.k;
        return bArr == null || Arrays.equals(bArr, eelvVar.k);
    }

    public final eelo f() {
        eelp g = g();
        if (g == null) {
            return null;
        }
        return (eelo) g.f();
    }

    public final eelp g() {
        return (eelp) e("Via");
    }

    public final String h() {
        eekh eekhVar = this.h;
        if (eekhVar == null) {
            return null;
        }
        return eekhVar.a();
    }

    public int hashCode() {
        int hashCode = ((this.l - 1) * 37) + this.d.hashCode();
        byte[] bArr = this.k;
        if (bArr != null) {
            for (byte b2 : bArr) {
                hashCode = (hashCode * 37) + b2;
            }
        }
        return hashCode;
    }

    public String i() {
        eekg eekgVar = this.g;
        if (eekgVar == null) {
            return null;
        }
        return eekgVar.e();
    }

    public final List j(String str) {
        eeku eekuVar = (eeku) this.a.get(str.toLowerCase(Locale.US));
        if (eekuVar == null) {
            return new ArrayList();
        }
        if (eekuVar instanceof eekv) {
            return ((eekv) eekuVar).a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(eekuVar);
        return arrayList;
    }

    public final void k(eeku eekuVar) {
        if (eekuVar instanceof eelo) {
            w(eekuVar, false, true);
        } else {
            w(eekuVar, false, false);
        }
    }

    public final void l(StringBuffer stringBuffer) {
        String i;
        x(stringBuffer);
        eekn eeknVar = this.i;
        if (eeknVar != null) {
            stringBuffer.append(eeknVar.c());
            stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        if (this.k != null) {
            try {
                eeko eekoVar = (eeko) this.a.get(fhpi.a.toLowerCase(Locale.US));
                String str = b;
                if (eekoVar != null && (i = eekoVar.i("charset")) != null) {
                    str = i;
                }
                stringBuffer.append(new String(this.k, str));
            } catch (Exception e) {
                dkty.q("Error trying to encode message content: %s", e.getMessage());
            }
        }
    }

    public final void m(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null");
        }
        eeku eekuVar = (eeku) this.a.get(str.toLowerCase(Locale.US));
        if (eekuVar == null) {
            return;
        }
        this.a.remove(str.toLowerCase(Locale.US));
        if (eekuVar instanceof eekt) {
            this.e = null;
        } else if (eekuVar instanceof eell) {
            this.f = null;
        } else if (eekuVar instanceof eekg) {
            this.g = null;
        } else if (eekuVar instanceof eekh) {
            this.h = null;
        } else if (eekuVar instanceof eekn) {
            this.i = null;
        } else if (eekuVar instanceof eekj) {
            this.j = null;
        }
        Iterator it = this.d.iterator();
        int i = -1;
        while (it.hasNext()) {
            i++;
            if (((eeku) it.next()).c.equalsIgnoreCase(str)) {
                break;
            }
        }
        if (i == -1 || i >= this.d.size()) {
            return;
        }
        this.d.remove(i);
    }

    public final void n(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Content must not be null");
        }
        eekn eeknVar = this.i;
        if (eeknVar != null) {
            eeknVar.b(bArr.length);
        }
        this.k = bArr;
    }

    public final void o(byte[] bArr, eeku eekuVar) {
        if (bArr == null) {
            throw new IllegalArgumentException("Content must not be null");
        }
        p(eekuVar);
        this.k = bArr;
        eekn eeknVar = this.i;
        if (eeknVar != null) {
            eeknVar.b(bArr.length);
        }
    }

    public final void p(eeku eekuVar) {
        if (eekuVar == null) {
            throw new IllegalArgumentException("Header must not be null!");
        }
        if ((eekuVar instanceof eekv) && ((eekv) eekuVar).i()) {
            return;
        }
        m(eekuVar.c);
        w(eekuVar, true, false);
    }

    public final boolean q(String str) {
        return this.a.containsKey(str.toLowerCase(Locale.US));
    }

    public final boolean r() {
        int i = this.l;
        return i == 3 || i == 4;
    }

    public final boolean s() {
        return this.l == 1;
    }

    public final boolean t() {
        return this.l == 2;
    }

    public final String u(int i) {
        String i2 = i();
        if (i2 == null) {
            return null;
        }
        return v(i2, i);
    }

    public final String v(String str, int i) {
        eekh eekhVar;
        eekg eekgVar = this.g;
        if (eekgVar == null || (eekhVar = this.h) == null) {
            return null;
        }
        String a = eekhVar.a();
        int b2 = eekgVar.b();
        return (i != 1 ? "OUTGOING" : "INCOMING") + "_" + a + "_" + str + "_" + b2;
    }
}
