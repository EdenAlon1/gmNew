package defpackage;

import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class umn implements DialogInterface.OnClickListener {
    final /* synthetic */ umw a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ffgu c;

    public umn(umw umwVar, Uri uri, ffgu ffguVar) {
        this.a = umwVar;
        this.b = uri;
        this.c = ffguVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        umw umwVar = this.a;
        axol.k(umwVar.h, null, new umm(i, umwVar, this.b, this.c, null), 3);
    }
}
