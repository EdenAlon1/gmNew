package defpackage;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Intent;
import android.provider.ContactsContract;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikc implements aigt {
    private final Activity a;
    private final lkk b;
    private final ffsk c;

    public aikc(Activity activity, lkk lkkVar, ffsk ffskVar) {
        ffskVar.getClass();
        this.a = activity;
        this.b = lkkVar;
        this.c = ffskVar;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        aijz aijzVar = (aijz) aihsVar;
        this.b.c(new aikb(this.c, aijzVar.d));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(aijzVar.c);
        intent.setDataAndType(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, aijzVar.a), aijzVar.b);
        long j = eldl.a;
        Intent intent2 = new Intent(intent);
        elcz u = eldl.u(intent2);
        try {
            this.a.startActivityForResult(intent2, 335300904);
            ffig.a(u, null);
            return ffcu.a;
        } finally {
        }
    }
}
