package defpackage;

import android.text.TextUtils;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cnjk implements cnjo {
    private static final cskc a = cskc.g("Bugle", "RcsFlagPattern");
    protected final csia e = new csia(new Supplier() { // from class: cnjg
        @Override // java.util.function.Supplier
        public final Object get() {
            return cnjk.this.d();
        }
    });

    protected abstract String b();

    public final engw d() {
        String b = b();
        if (TextUtils.isEmpty(b)) {
            int i = engw.d;
            return enou.a;
        }
        String[] split = b.split("\n");
        int i2 = engw.d;
        engr engrVar = new engr();
        for (String str : split) {
            if (!str.equals("")) {
                try {
                    engrVar.h(Pattern.compile(str));
                } catch (PatternSyntaxException e) {
                    csjb b2 = a.b();
                    b2.I("compilePatterns: Skipping bad expression:");
                    b2.I(str);
                    b2.s(e);
                }
            }
        }
        return engrVar.g();
    }

    public final void e() {
        this.e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cnjo
    public final boolean f(CharSequence charSequence) {
        engw engwVar = (engw) this.e.get();
        int size = engwVar.size();
        int i = 0;
        while (i < size) {
            boolean matches = ((Pattern) engwVar.get(i)).matcher(charSequence).matches();
            i++;
            if (matches) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cnjo
    public /* synthetic */ elfl gf(CharSequence charSequence, int i) {
        return elfo.e(false);
    }
}
