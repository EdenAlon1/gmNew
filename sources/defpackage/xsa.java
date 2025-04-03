package defpackage;

import android.content.Context;
import android.text.Annotation;
import android.text.Spanned;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsa implements xre {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/disabled/DisabledComposeRowUiAdapterImpl");
    public final Context b;
    public final ffsk c;
    public final ajjc d;
    public final ffbr e;
    public final ywt f;
    public final asvn g;
    public final ffbr h;
    private final fgdj i;

    public xsa(Context context, ffsk ffskVar, ajjc ajjcVar, ffbr ffbrVar, ffxx ffxxVar, fgcq fgcqVar, ffxx ffxxVar2, ywt ywtVar, asvn asvnVar, ffbr ffbrVar2) {
        context.getClass();
        ffskVar.getClass();
        ajjcVar.getClass();
        ffxxVar.getClass();
        fgcqVar.getClass();
        ffxxVar2.getClass();
        ywtVar.getClass();
        asvnVar.getClass();
        this.b = context;
        this.c = ffskVar;
        this.d = ajjcVar;
        this.e = ffbrVar;
        this.f = ywtVar;
        this.g = asvnVar;
        this.h = ffbrVar2;
        ffxx a2 = ffyy.a(new xrt(new xrq(fgcqVar)));
        ffjm ffjmVar = new ffjm() { // from class: xri
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                alxj alxjVar = (alxj) obj;
                alxj alxjVar2 = (alxj) obj2;
                alxjVar.getClass();
                alxjVar2.getClass();
                return Boolean.valueOf(ffkj.e(alxjVar.i(), alxjVar2.i()));
            }
        };
        ffji ffjiVar = ffyy.a;
        fflf.e(ffjmVar, 2);
        ffxx a3 = fgck.a(a2, ffyy.c(ffxxVar2, ffjiVar, ffjmVar), ffyy.a(new xrw(ffxxVar)), new xrz(this));
        int i = fgcz.a;
        this.i = fgbn.b(a3, ffskVar, fgcy.b, null);
    }

    @Override // defpackage.xre
    public final fgdj a() {
        return this.i;
    }

    public final xsb b(int i) {
        String string = this.b.getString(i);
        string.getClass();
        return new xsb(new dluu(string, (List) null, 6));
    }

    public final xsb c(String str, int i, final ffix ffixVar) {
        CharSequence text = this.b.getText(i);
        text.getClass();
        Spanned spanned = (Spanned) text;
        Iterator a2 = ffjw.a(spanned.getSpans(0, spanned.length(), Annotation.class));
        Annotation annotation = null;
        Annotation annotation2 = null;
        while (a2.hasNext()) {
            Annotation annotation3 = (Annotation) a2.next();
            String value = annotation3.getValue();
            if (ffkj.e(value, "conversationName")) {
                annotation2 = annotation3;
            } else if (ffkj.e(value, "link")) {
                annotation = annotation3;
            }
        }
        if (annotation == null) {
            throw new IllegalStateException("supplied resource had no annotation with id=\"link\"");
        }
        int spanStart = spanned.getSpanStart(annotation);
        int spanEnd = spanned.getSpanEnd(annotation);
        int length = annotation2 == null ? spanned.length() : spanned.getSpanStart(annotation2);
        if (str != null) {
            ksw.d(annotation2 != null, "supplied resource had no annotation with id=-\"conversationName\"");
            if (length < spanStart) {
                int length2 = str.length();
                spanEnd += str.length();
                spanStart += length2;
            }
        } else if (annotation2 != null) {
            throw new IllegalStateException("no value to fill for annotation with id=\"conversationName\"");
        }
        int i2 = spanStart;
        int i3 = spanEnd;
        StringBuilder sb = new StringBuilder();
        sb.append(spanned.subSequence(0, length));
        if (str != null) {
            sb.append(str);
        }
        sb.append(spanned.subSequence(length, spanned.length()));
        String sb2 = sb.toString();
        dlus dlusVar = dlus.h;
        String substring = sb2.substring(i2, i3);
        substring.getClass();
        return new xsb(new dluu(sb2, ffdx.b(new dlto(dlusVar, i2, i3, substring, new ffji() { // from class: xrj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ffix.this.invoke();
                return true;
            }
        })), 4));
    }
}
