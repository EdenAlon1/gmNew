package defpackage;

import com.android.vcard.VCardBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eekv extends eeku {
    public final List a;

    public eekv() {
        this.a = new ArrayList();
    }

    @Override // defpackage.eeku
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < this.a.size()) {
            stringBuffer.append(((eeku) this.a.get(i)).a());
            i++;
            if (i < this.a.size()) {
                stringBuffer.append(",");
            }
        }
        return stringBuffer.toString();
    }

    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final String c() {
        if (this.a.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (this.c.equals("WWW-Authenticate") || this.c.equals("Via") || this.c.equals("Proxy-Authenticate") || this.c.equals("Authorization") || this.c.equals("Proxy-Authorization")) {
            for (int i = 0; i < this.a.size(); i++) {
                stringBuffer.append(((eeku) this.a.get(i)).c());
            }
            return stringBuffer.toString();
        }
        return this.c + ": " + a() + VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public Object clone() {
        eekv eekvVar = new eekv();
        String str = this.c;
        if (str != null) {
            eekvVar.c = str;
        }
        String str2 = this.d;
        if (str2 != null) {
            eekvVar.d = str2;
        }
        for (int i = 0; i < this.a.size(); i++) {
            eekvVar.a.add((eeku) ((eeku) this.a.get(i)).clone());
        }
        return eekvVar;
    }

    @Override // defpackage.eeku
    public final eejd d() {
        return null;
    }

    public final eeku e(int i) {
        return (eeku) this.a.get(i);
    }

    @Override // defpackage.eeku
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof eekv) && this.a.equals(((eekv) obj).a)) {
            return super.equals(obj);
        }
        return false;
    }

    public final eeku f() {
        if (this.a.size() == 0) {
            return null;
        }
        return (eeku) this.a.get(0);
    }

    public final void g(eeku eekuVar) {
        if (!this.c.equals(eekuVar.c)) {
            throw new IllegalArgumentException("bad type");
        }
        this.a.add(eekuVar);
    }

    @Override // defpackage.eeku
    public final int hashCode() {
        int hashCode = super.hashCode();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 37) + ((eeku) it.next()).hashCode();
        }
        return hashCode;
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public eekv(String str) {
        this.a = new ArrayList();
        this.c = str;
    }

    public eekv(eeku... eekuVarArr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        eeku eekuVar = eekuVarArr[0];
        if (eekuVar == null) {
            return;
        }
        this.c = eekuVar.c;
        Collections.addAll(arrayList, eekuVarArr);
    }
}
