package defpackage;

import android.util.Log;
import androidx.car.app.model.Alert;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayvm {
    private final engw d;
    private final engw e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ayhh k;
    private final LinkedList l;
    private final HashMap m = new HashMap();
    private static final enip b = enip.v(' ', '@', '.', ',', ':', '-', '(', ')', '+', '[', ']', '{', '}', '<', '>');
    private static final enip c = enip.t("ʼWAP_PUSH_SI!ʼ", "ʼUNKNOWN_SENDER!ʼ", "EMERGENCY+SERVICE+PROVIDER", "EMERGENCY+SERVICE+PROVIDER+DEMO");
    static final cfup a = cfvl.e(cfvl.b, "bcm_number_of_digits_to_anonymize", Alert.DURATION_SHOW_INDEFINITELY);

    public ayvm(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Function function, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ayhi ayhiVar, String str) {
        Object apply;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.j = ffbrVar5;
        this.f = ffbrVar4;
        if (((diwm) ffbrVar6.b()).a()) {
            enip enipVar = b;
            Function m105m = afg$$ExternalSyntheticApiModelOutline0.m105m(ayhiVar.a.b());
            m105m.getClass();
            dixh dixhVar = (dixh) ayhiVar.b.b();
            dixhVar.getClass();
            enipVar.getClass();
            this.k = new ayhh(m105m, dixhVar, str, enipVar);
            int i = engw.d;
            this.d = enou.a;
            this.l = new LinkedList();
            this.e = enou.a;
            return;
        }
        apply = function.apply(str);
        Random random = (Random) apply;
        this.k = null;
        ArrayList c2 = enkr.c('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K');
        Collections.shuffle(c2, random);
        this.d = engw.n(c2);
        ArrayList c3 = enkr.c('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z');
        Collections.shuffle(c3, random);
        this.l = new LinkedList(c3);
        if (!((dixh) ffbrVar5.b()).a()) {
            this.e = enou.a;
            return;
        }
        ArrayList c4 = enkr.c('L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V');
        Collections.shuffle(c4, random);
        this.e = engw.n(c4);
    }

    private final Character e() {
        char c2 = '?';
        if (this.l.isEmpty()) {
            return '?';
        }
        try {
            Character ch = (Character) this.l.removeFirst();
            if (ch != null) {
                c2 = ch.charValue();
            }
            return Character.valueOf(c2);
        } catch (NoSuchElementException unused) {
            return '?';
        }
    }

    private final String f(String str) {
        StringBuilder sb = new StringBuilder();
        g(str, sb, 0);
        return sb.toString();
    }

    private final void g(String str, StringBuilder sb, int i) {
        if (str.indexOf(64, i) == -1) {
            int max = Math.max(((Integer) a.e()).intValue(), 7);
            int length = str.length() - 1;
            while (length >= i && max > 0) {
                char charAt = str.charAt(length);
                if (!Character.isWhitespace(charAt) && !ayhh.b(charAt) && !b.contains(Character.valueOf(charAt))) {
                    max--;
                }
                length--;
            }
            int i2 = length + 1;
            while (i < i2) {
                sb.append(str.charAt(i));
                i++;
            }
        }
        while (i < str.length()) {
            char charAt2 = str.charAt(i);
            ayhh ayhhVar = this.k;
            if (ayhhVar != null) {
                sb.append(ayhhVar.a(charAt2));
            } else if (!Character.isDigit(charAt2)) {
                if (!Character.isWhitespace(charAt2) && !ayhh.b(charAt2)) {
                    enip enipVar = b;
                    Character valueOf = Character.valueOf(charAt2);
                    if (!enipVar.contains(valueOf)) {
                        if (this.m.containsKey(valueOf)) {
                            sb.append(this.m.get(valueOf));
                        } else {
                            Character e = e();
                            this.m.put(valueOf, e);
                            sb.append(e);
                        }
                    }
                }
                sb.append(charAt2);
            } else if (((dixh) this.j.b()).a()) {
                sb.append(((charAt2 < '0' || charAt2 > '9') ? this.e : this.d).get(Character.digit(charAt2, 10)));
            } else {
                sb.append(this.d.get(charAt2 - '0'));
            }
            i++;
        }
    }

    public final ayvk a(String str) {
        esfh esfhVar;
        clax a2;
        String valueOf;
        int indexOf;
        String a3 = ((ctve) this.g.b()).a();
        if (str == null) {
            str = "";
        }
        ayhg ayhgVar = null;
        try {
            esfhVar = ((esfl) this.f.b()).n(str.trim().trim(), a3);
        } catch (esfg unused) {
            esfhVar = null;
        }
        StringBuilder sb = new StringBuilder();
        boolean contains = c.contains(str);
        int i = 0;
        if (esfhVar != null) {
            boolean z = (!esfhVar.e() || esfhVar.f() == 1 || esfhVar.f() == 5) ? false : true;
            if (z && (indexOf = str.indexOf((valueOf = String.valueOf(esfhVar.a())))) >= 0) {
                sb.append((CharSequence) str, 0, valueOf.length() + indexOf);
                i = indexOf + valueOf.length();
            }
            ayhgVar = new ayhg(esfhVar.d() ? Optional.of(new ctvf(esfhVar.a())) : Optional.empty(), z ? Optional.of(new ctvf(esfhVar.a())) : Optional.empty(), f(((esfl) this.f.b()).d(esfhVar)));
        }
        g(str, sb, i);
        if (((clbc) this.h.b()).b(str) && (a2 = ((clbc) this.h.b()).a(str)) != null) {
            epvg epvgVar = (epvg) epvh.a.createBuilder();
            String f = f(((clat) a2).c);
            epvgVar.copyOnWrite();
            epvh epvhVar = (epvh) epvgVar.instance;
            epvhVar.b |= 1;
            epvhVar.c = f;
            return new ayhf(a3, "", "", null, null, (epvh) epvgVar.build());
        }
        if (((ckdn) this.i.b()).e(str)) {
            cpay a4 = ((ckdn) this.i.b()).a(str);
            Optional empty = a4 == null ? Optional.empty() : b(a4);
            if (empty.isPresent()) {
                return new ayhf(a3, "", "", null, (epvb) empty.get(), null);
            }
        }
        String sb2 = sb.toString();
        if (!contains) {
            str = f(str);
        }
        return new ayhf(a3, sb2, str, ayhgVar, null, null);
    }

    public final Optional b(cpay cpayVar) {
        epva epvaVar = (epva) epvb.a.createBuilder();
        String f = f(cpayVar.c);
        epvaVar.copyOnWrite();
        epvb epvbVar = (epvb) epvaVar.instance;
        epvbVar.b |= 1;
        epvbVar.c = f;
        String str = cpayVar.a;
        if (str != null) {
            String f2 = f(str);
            epvaVar.copyOnWrite();
            epvb epvbVar2 = (epvb) epvaVar.instance;
            epvbVar2.b |= 4;
            epvbVar2.e = f2;
        }
        String str2 = cpayVar.b;
        if (str2 != null) {
            String f3 = f(str2);
            epvaVar.copyOnWrite();
            epvb epvbVar3 = (epvb) epvaVar.instance;
            epvbVar3.b |= 2;
            epvbVar3.d = f3;
        }
        return Optional.of((epvb) epvaVar.build());
    }

    public final String c(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        g(str, sb, 0);
        return sb.toString();
    }

    final String d(String str) {
        return Log.isLoggable("Bugle", 3) ? a.a(str, "raw-pii[", "]") : ((ayhf) a(str)).a;
    }
}
