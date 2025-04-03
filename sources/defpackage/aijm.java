package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijm implements aigt {
    private final Context a;
    private final axul b;

    public aijm(Context context, axul axulVar) {
        axulVar.getClass();
        this.a = context;
        this.b = axulVar;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        aijl aijlVar = (aijl) aihsVar;
        Uri uri = aijlVar.a;
        if (uri != null) {
            this.b.f(this.a, uri, aijlVar.d, aijlVar.c);
        } else {
            aoku aokuVar = aijlVar.b;
            if (aokuVar == null) {
                throw new IllegalArgumentException("Either contactUri or identity must be set.");
            }
            this.b.d(this.a, aokuVar, aijlVar.d, aijlVar.c);
        }
        return ffcu.a;
    }
}
