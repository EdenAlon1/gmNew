package defpackage;

import com.google.gson.internal.bind.EnumTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters$29;
import com.google.gson.internal.bind.TypeAdapters$30;
import defpackage.evkn;
import defpackage.evlf;
import defpackage.evos;
import defpackage.evpj;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evpa {
    public static final evlg A;
    public static final evlf B;
    public static final evlg C;
    public static final evlf D;
    public static final evlg E;
    public static final evlf F;
    public static final evlg G;
    public static final evlf H;
    public static final evlg I;
    public static final evlf J;
    public static final evlg K;
    public static final evlf L;
    public static final evlg M;
    public static final evlf N;
    public static final evlg O;
    public static final evlf P;
    public static final evlg Q;
    public static final evlf R;
    public static final evlg S;
    public static final evlf T;
    public static final evlg U;
    public static final evlg V;
    public static final evlf a;
    public static final evlg b;
    public static final evlf c;
    public static final evlg d;
    public static final evlf e;
    public static final evlf f;
    public static final evlg g;
    public static final evlf h;
    public static final evlg i;
    public static final evlf j;
    public static final evlg k;
    public static final evlf l;
    public static final evlg m;
    public static final evlf n;
    public static final evlg o;
    public static final evlf p;
    public static final evlg q;
    public static final evlf r;
    public static final evlg s;
    public static final evlf t;
    public static final evlf u;
    public static final evlg v;
    public static final evlf w;
    public static final evlf x;
    public static final evlf y;
    public static final evlf z;

    static {
        evlf d2 = new evoi().d();
        a = d2;
        b = new TypeAdapters$29(Class.class, d2);
        evlf d3 = new evor().d();
        c = d3;
        d = new TypeAdapters$29(BitSet.class, d3);
        evot evotVar = new evot();
        e = evotVar;
        f = new evou();
        g = new TypeAdapters$30(Boolean.TYPE, Boolean.class, evotVar);
        evov evovVar = new evov();
        h = evovVar;
        i = new TypeAdapters$30(Byte.TYPE, Byte.class, evovVar);
        evow evowVar = new evow();
        j = evowVar;
        k = new TypeAdapters$30(Short.TYPE, Short.class, evowVar);
        evox evoxVar = new evox();
        l = evoxVar;
        m = new TypeAdapters$30(Integer.TYPE, Integer.class, evoxVar);
        evlf d4 = new evoy().d();
        n = d4;
        o = new TypeAdapters$29(AtomicInteger.class, d4);
        evlf d5 = new evoz().d();
        p = d5;
        q = new TypeAdapters$29(AtomicBoolean.class, d5);
        evlf d6 = new evoa().d();
        r = d6;
        s = new TypeAdapters$29(AtomicIntegerArray.class, d6);
        t = new evob();
        evoc evocVar = new evoc();
        u = evocVar;
        v = new TypeAdapters$30(Character.TYPE, Character.class, evocVar);
        evod evodVar = new evod();
        w = evodVar;
        x = new evoe();
        y = new evof();
        z = new evog();
        A = new TypeAdapters$29(String.class, evodVar);
        evoh evohVar = new evoh();
        B = evohVar;
        C = new TypeAdapters$29(StringBuilder.class, evohVar);
        evoj evojVar = new evoj();
        D = evojVar;
        E = new TypeAdapters$29(StringBuffer.class, evojVar);
        evok evokVar = new evok();
        F = evokVar;
        G = new TypeAdapters$29(URL.class, evokVar);
        evol evolVar = new evol();
        H = evolVar;
        I = new TypeAdapters$29(URI.class, evolVar);
        final evom evomVar = new evom();
        J = evomVar;
        final Class<InetAddress> cls = InetAddress.class;
        K = new evlg() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // defpackage.evlg
            public final evlf a(evkn evknVar, evpj evpjVar) {
                Class cls2 = cls;
                Class<?> cls3 = evpjVar.a;
                if (cls2.isAssignableFrom(cls3)) {
                    return new evos(evomVar, cls3);
                }
                return null;
            }

            public final String toString() {
                evlf evlfVar = evomVar;
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + evlfVar.toString() + "]";
            }
        };
        evon evonVar = new evon();
        L = evonVar;
        M = new TypeAdapters$29(UUID.class, evonVar);
        evlf d7 = new evoo().d();
        N = d7;
        O = new TypeAdapters$29(Currency.class, d7);
        final evop evopVar = new evop();
        P = evopVar;
        final Class<Calendar> cls2 = Calendar.class;
        final Class<GregorianCalendar> cls3 = GregorianCalendar.class;
        Q = new evlg() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // defpackage.evlg
            public final evlf a(evkn evknVar, evpj evpjVar) {
                Class cls4 = evpjVar.a;
                if (cls4 == cls2 || cls4 == cls3) {
                    return evopVar;
                }
                return null;
            }

            public final String toString() {
                evlf evlfVar = evopVar;
                Class cls4 = cls3;
                return "Factory[type=" + cls2.getName() + "+" + cls4.getName() + ",adapter=" + evlfVar.toString() + "]";
            }
        };
        evoq evoqVar = new evoq();
        R = evoqVar;
        S = new TypeAdapters$29(Locale.class, evoqVar);
        final evnm evnmVar = evnm.a;
        T = evnmVar;
        final Class<evkt> cls4 = evkt.class;
        U = new evlg() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // defpackage.evlg
            public final evlf a(evkn evknVar, evpj evpjVar) {
                Class cls22 = cls4;
                Class<?> cls32 = evpjVar.a;
                if (cls22.isAssignableFrom(cls32)) {
                    return new evos(evnmVar, cls32);
                }
                return null;
            }

            public final String toString() {
                evlf evlfVar = evnmVar;
                return "Factory[typeHierarchy=" + cls4.getName() + ",adapter=" + evlfVar.toString() + "]";
            }
        };
        V = EnumTypeAdapter.a;
    }
}
