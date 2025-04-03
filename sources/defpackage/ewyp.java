package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewyp implements ewyb {
    private final engw a;

    public ewyp(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.ewyb
    public final emxc a() {
        return emux.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ewyb
    public final String b(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            engw engwVar = this.a;
            if (i >= ((enou) engwVar).c) {
                return TextUtils.join(",", arrayList);
            }
            arrayList.add(((Locale) engwVar.get(i)).getLanguage());
            i++;
        }
    }
}
