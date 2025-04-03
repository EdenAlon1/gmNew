package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewya implements ewyb {
    public final emwl a;
    private final emyl b;
    private final emyl c;

    public ewya(emwl emwlVar, emyl emylVar, emyl emylVar2) {
        this.a = emwlVar;
        this.b = emylVar;
        this.c = emylVar2;
    }

    @Override // defpackage.ewyb
    public final emxc a() {
        return (emxc) this.c.get();
    }

    @Override // defpackage.ewyb
    public final String b(final CharSequence charSequence) {
        return (String) ((emxc) this.b.get()).b(new emwl() { // from class: ewxz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Float f = (Float) obj;
                if (f.floatValue() < 0.0f || f.floatValue() > 1.0f) {
                    Objects.toString(f);
                    Log.w("LangIdLanguageDetector", "[detectLanguageTagsFromText] unexpected threshold is found: ".concat(String.valueOf(f)));
                    return "";
                }
                CharSequence charSequence2 = charSequence;
                ewya ewyaVar = ewya.this;
                Object apply = ewyaVar.a.apply(new ewwc(charSequence2));
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    ewwa ewwaVar = (ewwa) apply;
                    int i2 = ((enou) ewwaVar.a).c;
                    if (i >= i2) {
                        break;
                    }
                    emxf.v(i, i2);
                    if (((exad) ewwaVar.a.get(i)).a() < f.floatValue()) {
                        break;
                    }
                    emxf.v(i, ((enou) ewwaVar.a).c);
                    arrayList.add(((exad) ewwaVar.a.get(i)).b().getLanguage());
                    i++;
                }
                return TextUtils.join(",", arrayList);
            }
        }).e("");
    }
}
