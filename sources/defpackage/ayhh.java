package defpackage;

import j$.util.Map;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayhh {
    private final enip a;
    private final engw b;
    private final engw c;
    private final dixh d;
    private final HashMap e = new HashMap();
    private final LinkedList f;

    public ayhh(Function function, dixh dixhVar, String str, enip enipVar) {
        Object apply;
        this.d = dixhVar;
        apply = function.apply(str);
        Random random = (Random) apply;
        ArrayList c = enkr.c('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K');
        Collections.shuffle(c, random);
        this.b = engw.n(c);
        ArrayList c2 = enkr.c('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z');
        Collections.shuffle(c2, random);
        this.f = new LinkedList(c2);
        if (dixhVar.a()) {
            ArrayList c3 = enkr.c('L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V');
            Collections.shuffle(c3, random);
            this.c = engw.n(c3);
        } else {
            this.c = enou.a;
        }
        this.a = enipVar;
    }

    static boolean b(char c) {
        if (Character.isISOControl(c)) {
            return true;
        }
        if (Character.isLetterOrDigit(c)) {
            return false;
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        return (of != null && of.equals(Character.UnicodeBlock.SPECIALS)) || Character.getType(c) == 16;
    }

    private final char c() {
        if (this.f.isEmpty()) {
            return '?';
        }
        try {
            Character ch = (Character) this.f.removeFirst();
            if (ch == null) {
                return '?';
            }
            return ch.charValue();
        } catch (NoSuchElementException unused) {
            return '?';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final char a(char c) {
        if (Character.isDigit(c)) {
            if (c >= '0' && c <= '9') {
                return ((Character) this.b.get(c - '0')).charValue();
            }
            if (!this.d.a()) {
                return c;
            }
            return ((Character) this.c.get(Character.digit(c, 10))).charValue();
        }
        if (Character.isWhitespace(c) || b(c)) {
            return c;
        }
        enip enipVar = this.a;
        Character valueOf = Character.valueOf(c);
        if (enipVar.contains(valueOf)) {
            return c;
        }
        if (this.e.containsKey(valueOf)) {
            return ((Character) Map.EL.getOrDefault(this.e, valueOf, '?')).charValue();
        }
        char c2 = c();
        this.e.put(valueOf, Character.valueOf(c2));
        return c2;
    }
}
