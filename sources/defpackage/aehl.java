package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aehl implements aema {
    private final Context a;
    private final czyi b;
    private View c;

    public aehl(Context context, czyi czyiVar) {
        this.a = context;
        this.b = czyiVar;
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        String E = aelyVar.E();
        if (aelyVar.F() != null) {
            E = E + " " + aelyVar.F();
        }
        this.c.setContentDescription(E);
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.c = view;
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        return !TextUtils.equals(aelyVar.E(), aelyVar2.E());
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c1, code lost:
    
        if (r8 == 130) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a4, code lost:
    
        if (r8 == 130) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c6, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c3, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    @Override // defpackage.aema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.aelx r35, defpackage.aeki r36) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aehl.e(aelx, aeki):void");
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
