package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acer extends acep {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;

    public acer(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DumpDatabaseAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        Map map = (Map) this.c.b();
        map.getClass();
        parcel.getClass();
        return new DumpDatabaseAction(context, this.b, map, parcel);
    }

    public final DumpDatabaseAction b(boolean z) {
        Context context = (Context) this.a.b();
        context.getClass();
        Map map = (Map) this.c.b();
        map.getClass();
        return new DumpDatabaseAction(context, this.b, map, z);
    }
}
