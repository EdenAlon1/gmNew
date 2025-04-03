package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cstx {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils");
    private static final List c;
    private static final List d;
    private static final List e;
    private static final List f;
    public lew b;
    private emyl g = emys.a(new emyl() { // from class: cstt
        @Override // defpackage.emyl
        public final Object get() {
            return new TextPaint();
        }
    });
    private final crsy h = new crsy();
    private final les i = new cstu(this);
    private final lgg j = new cstv();

    static {
        ArrayList arrayList = new ArrayList();
        c = arrayList;
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        arrayList.add(35);
        arrayList.add(42);
        for (int i = 0; i <= 9; i++) {
            c.add(Integer.valueOf(i + 48));
        }
        List list = d;
        list.add(65038);
        list.add(65039);
        list.add(8205);
        List list2 = e;
        list2.add(8294);
        list2.add(8297);
        List list3 = f;
        list3.add(127995);
        list3.add(127996);
        list3.add(127997);
        list3.add(127998);
        list3.add(127999);
        list3.add(8205);
        list3.add(65038);
        list3.add(65039);
    }

    public cstx(Context context) {
        if (ctid.g(context)) {
            krj krjVar = new krj("Noto Color Emoji Compat");
            lfe lfeVar = new lfe(context, krjVar);
            List list = c;
            lfeVar.c = true;
            int i = 0;
            if (list != null) {
                lfeVar.d = new int[list.size()];
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    lfeVar.d[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                Arrays.sort(lfeVar.d);
            } else {
                lfeVar.d = null;
            }
            lfeVar.a(this.i);
            lgw lgwVar = new lgw(context, krjVar);
            List list2 = c;
            lgwVar.b = true;
            if (list2 != null) {
                lgwVar.c = new int[list2.size()];
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    lgwVar.c[i] = ((Integer) it2.next()).intValue();
                    i++;
                }
                Arrays.sort(lgwVar.c);
            } else {
                lgwVar.c = null;
            }
            lgg lggVar = this.j;
            Executor a2 = lfz.a();
            ksw.i(lggVar, "initCallback cannot be null");
            if (lgwVar.d == null) {
                lgwVar.d = new cmj();
            }
            lgwVar.d.add(new lgj(a2, lggVar));
            if (((Boolean) cful.ap.e()).booleanValue()) {
                lfeVar.b = true;
                lgwVar.a = true;
            }
            ensk h = a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils", "emojiInit", 164, "EmojiUtils.java")).q("Initializing EmojiCompat");
            lew.h(lfeVar);
            if (lgl.b == null) {
                synchronized (lgl.a) {
                    if (lgl.b == null) {
                        lgl.b = new lgl(lgwVar);
                    }
                }
            }
        }
    }

    public static boolean d(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (codePointAt != 10 && codePointAt != 32 && !e.contains(Integer.valueOf(codePointAt))) {
                return false;
            }
            i++;
        }
        return true;
    }

    private final eoos i(final String str, final boolean z) {
        Object obj;
        cstq cstqVar = new cstq(str, z);
        ffix ffixVar = new ffix() { // from class: cstr
            @Override // defpackage.ffix
            public final Object invoke() {
                ksr ksrVar;
                boolean z2 = z;
                cstx cstxVar = cstx.this;
                if (cstxVar.f()) {
                    String str2 = str;
                    int i = 0;
                    if (TextUtils.isEmpty(str2)) {
                        ksrVar = new ksr(0, 0);
                    } else {
                        lew lewVar = cstxVar.b;
                        if (lewVar == null) {
                            ksrVar = new ksr(-1, -1);
                        } else {
                            CharSequence c2 = lewVar.c(str2);
                            if (c2 instanceof Spannable) {
                                Spannable spannable = (Spannable) c2;
                                lfb[] lfbVarArr = (lfb[]) spannable.getSpans(0, spannable.length(), lfb.class);
                                int length = lfbVarArr.length;
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    if (i < length) {
                                        lfb lfbVar = lfbVarArr[i];
                                        int spanStart = spannable.getSpanStart(lfbVar);
                                        int spanEnd = spannable.getSpanEnd(lfbVar);
                                        if (i2 != spanStart && !cstx.d(str2, i2, spanStart)) {
                                            i3 += spanStart - i2;
                                            if (z2) {
                                                ksrVar = new ksr(Integer.valueOf(lfbVarArr.length), Integer.valueOf(i3));
                                                z2 = true;
                                                break;
                                            }
                                        }
                                        i++;
                                        i2 = spanEnd;
                                    } else {
                                        if (i2 != spannable.length() && !cstx.d(str2, i2, spannable.length())) {
                                            i3 += spannable.length() - i2;
                                        }
                                        ksrVar = new ksr(Integer.valueOf(lfbVarArr.length), Integer.valueOf(i3));
                                    }
                                }
                            } else {
                                ksrVar = new ksr(-1, -1);
                            }
                        }
                    }
                } else {
                    ksrVar = new ksr(-1, -1);
                }
                Object obj2 = ksrVar.b;
                Integer num = (Integer) ksrVar.a;
                Integer num2 = (Integer) obj2;
                if (num == null || num2 == null) {
                    return eoos.UNKNOWN_EMOJI_STATUS;
                }
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                if (intValue < 0 || intValue2 < 0) {
                    return eoos.UNKNOWN_EMOJI_STATUS;
                }
                if (z2 && intValue2 > 0) {
                    return eoos.EMOJI_STATUS_NO_EMOJI;
                }
                if (intValue == 1) {
                    if (intValue2 == 0) {
                        return eoos.EMOJI_STATUS_SINGLE_EMOJI_ONLY;
                    }
                } else if (intValue <= 0) {
                    return eoos.EMOJI_STATUS_NO_EMOJI;
                }
                return intValue2 > 0 ? eoos.EMOJI_STATUS_SOME_EMOJI : eoos.EMOJI_STATUS_ALL_EMOJI;
            }
        };
        crsy crsyVar = this.h;
        synchronized (crsyVar.b) {
            obj = crsyVar.a.get(cstqVar);
            if (obj == null) {
                obj = ffixVar.invoke();
            }
            crsyVar.a.remove(cstqVar);
            crsyVar.a.put(cstqVar, obj);
        }
        return (eoos) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ksr a(String str) {
        engw engwVar;
        if (f()) {
            CharSequence c2 = this.b.c(str);
            if (c2 instanceof Spannable) {
                final Spannable spannable = (Spannable) c2;
                Stream sorted = DesugarArrays.stream((lfb[]) spannable.getSpans(0, spannable.length(), lfb.class)).map(new Function() { // from class: csts
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        lfb lfbVar = (lfb) obj;
                        enru enruVar = cstx.a;
                        Spannable spannable2 = spannable;
                        int spanStart = spannable2.getSpanStart(lfbVar);
                        int spanEnd = spannable2.getSpanEnd(lfbVar);
                        emxf.l(spanStart < spanEnd);
                        return new cstw(spanStart, spanEnd);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).sorted();
                int i = engw.d;
                engwVar = (engw) sorted.collect(endq.a);
            } else {
                int i2 = engw.d;
                engwVar = enou.a;
            }
        } else {
            engwVar = null;
        }
        if (engwVar == null) {
            return new ksr(-1, -1);
        }
        int size = engwVar.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            cstw cstwVar = (cstw) engwVar.get(i5);
            emxf.l(cstwVar.a >= i4);
            i3 += cstwVar.a - i4;
            i4 = cstwVar.b;
        }
        return new ksr(Integer.valueOf(engwVar.size()), Integer.valueOf(i3 + (str.length() - i4)));
    }

    public final eoos b(String str) {
        return i(str, false);
    }

    public final List c(String str) {
        if (!f()) {
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils", "getEmojisListUsingEmojiCompat", 350, "EmojiUtils.java")).q("Bugle: EmojiCompat initialization failed");
            int i = engw.d;
            return enou.a;
        }
        if (TextUtils.isEmpty(str)) {
            int i2 = engw.d;
            return enou.a;
        }
        CharSequence c2 = this.b.c(str);
        if (!(c2 instanceof Spannable)) {
            int i3 = engw.d;
            return enou.a;
        }
        ArrayList arrayList = new ArrayList();
        Spannable spannable = (Spannable) c2;
        int i4 = 0;
        lfb[] lfbVarArr = (lfb[]) spannable.getSpans(0, spannable.length(), lfb.class);
        int length = lfbVarArr.length;
        int i5 = 0;
        while (i4 < length) {
            lfb lfbVar = lfbVarArr[i4];
            int spanStart = spannable.getSpanStart(lfbVar);
            int spanEnd = spannable.getSpanEnd(lfbVar);
            if (i5 != spanStart && !d(str, i5, spanStart)) {
                int i6 = engw.d;
                return enou.a;
            }
            arrayList.add(str.substring(spanStart, spanEnd));
            i4++;
            i5 = spanEnd;
        }
        if (i5 == str.length() || d(str, i5, str.length())) {
            return engw.n(arrayList);
        }
        int i7 = engw.d;
        return enou.a;
    }

    public final boolean e(CharSequence charSequence) {
        lew lewVar = this.b;
        if (lewVar == null) {
            return false;
        }
        ksw.d(lewVar.g(), "Not initialized yet");
        ksw.i(charSequence, "sequence cannot be null");
        return lewVar.e.a.a(charSequence) != null;
    }

    public final boolean f() {
        return this.b != null;
    }

    public final boolean g(CharSequence charSequence) {
        eoos i = i(charSequence.toString(), true);
        return i == eoos.EMOJI_STATUS_SINGLE_EMOJI_ONLY || i == eoos.EMOJI_STATUS_ALL_EMOJI;
    }

    public final boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((TextPaint) this.g.get()).hasGlyph(str);
    }
}
