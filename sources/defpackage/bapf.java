package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bapf implements bbck {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;

    public bapf(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        ffbrVar5.getClass();
        this.e = ffbrVar5;
        ffbrVar6.getClass();
        this.f = ffbrVar6;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RebuildShortcutsAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        Optional optional = (Optional) this.b.b();
        optional.getClass();
        bcqg bcqgVar = (bcqg) this.c.b();
        bcqgVar.getClass();
        errm errmVar = (errm) this.d.b();
        errmVar.getClass();
        errm errmVar2 = (errm) this.f.b();
        errmVar2.getClass();
        parcel.getClass();
        return new RebuildShortcutsAction(context, optional, bcqgVar, errmVar, this.e, errmVar2, parcel);
    }
}
