package defpackage;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efep {
    public static final fasj a;

    static {
        fasi fasiVar = (fasi) fasj.a.createBuilder();
        farx farxVar = farx.a;
        fasiVar.copyOnWrite();
        fasj fasjVar = (fasj) fasiVar.instance;
        farxVar.getClass();
        fasjVar.c = farxVar;
        fasjVar.b = 1;
        fasi fasiVar2 = (fasi) fasj.a.createBuilder();
        fasf fasfVar = fasf.a;
        fasiVar2.copyOnWrite();
        fasj fasjVar2 = (fasj) fasiVar2.instance;
        fasfVar.getClass();
        fasjVar2.c = fasfVar;
        fasjVar2.b = 2;
        a = (fasj) fasiVar2.build();
        fasi fasiVar3 = (fasi) fasj.a.createBuilder();
        fash fashVar = fash.a;
        fasiVar3.copyOnWrite();
        fasj fasjVar3 = (fasj) fasiVar3.instance;
        fashVar.getClass();
        fasjVar3.c = fashVar;
        fasjVar3.b = 3;
    }

    public static String a(fasl faslVar) {
        int i = engw.d;
        engr engrVar = new engr();
        Iterator<E> it = faslVar.b.iterator();
        while (it.hasNext()) {
            engrVar.h(b((fasj) it.next()));
        }
        return efdg.a(engrVar.g());
    }

    public static String b(fasj fasjVar) {
        int i;
        String str;
        int i2 = fasjVar.b;
        switch (i2) {
            case 0:
                i = 7;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            return "compress";
        }
        if (i3 == 1) {
            fasf fasfVar = i2 == 2 ? (fasf) fasjVar.c : fasf.a;
            int i4 = fasfVar.b;
            if (i4 == 1) {
                return "encrypt(aes_gcm_key=" + c((String) fasfVar.c) + ")";
            }
            if (i4 != 2) {
                return "encrypt";
            }
            return "encrypt(aes_gcm_hkdf_key=" + c((String) fasfVar.c) + ")";
        }
        if (i3 == 2) {
            fash fashVar = i2 == 3 ? (fash) fasjVar.c : fash.a;
            if (fashVar.b != 1) {
                return "integrity";
            }
            return "integrity(sha256=" + c((String) fashVar.c) + ")";
        }
        if (i3 == 3) {
            fasn fasnVar = i2 == 4 ? (fasn) fasjVar.c : fasn.a;
            emxf.a(1 == (fasnVar.b & 1));
            return "zip(target=" + c(fasnVar.c) + ")";
        }
        if (i3 != 4) {
            if (i3 == 5) {
                return "defrag";
            }
            throw new IllegalArgumentException("No transform specified");
        }
        fasb fasbVar = i2 == 5 ? (fasb) fasjVar.c : fasb.a;
        if (fasbVar.c.size() > 0) {
            int i5 = engw.d;
            engr engrVar = new engr();
            for (fasa fasaVar : fasbVar.c) {
                emxf.a(1 == (fasaVar.b & 1));
                if ((fasaVar.b & 2) != 0) {
                    engrVar.h(fasaVar.c + "=" + c(fasaVar.d));
                } else {
                    engrVar.h(fasaVar.c);
                }
            }
            str = "(" + new emww(",").b(engrVar.g()) + ")";
        } else {
            str = "";
        }
        return String.valueOf(fasbVar.b).concat(str);
    }

    private static final String c(String str) {
        try {
            return URLEncoder.encode(str, efdb.a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
