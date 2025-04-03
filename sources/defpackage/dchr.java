package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchr implements dchj {
    public static final Uri[] a = {MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.EXTERNAL_CONTENT_URI};
    public final errl b;
    public final ejtr c;
    public final bdjd d;
    public final ctud e;
    public final cqoh f;
    public final boolean g;
    public final boolean h = ((Boolean) cful.a.e()).booleanValue();
    public final Function i;

    public dchr(Context context, errl errlVar, lkr lkrVar, ejtr ejtrVar, elbx elbxVar, ejvp ejvpVar, bdjd bdjdVar, ctud ctudVar, cqoh cqohVar, final dchi dchiVar) {
        this.b = errlVar;
        this.c = ejtrVar;
        this.d = bdjdVar;
        this.e = ctudVar;
        this.f = cqohVar;
        this.g = context.getPackageManager().hasSystemFeature("android.hardware.camera");
        this.i = new Function() { // from class: dchl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                Uri[] uriArr = dchr.a;
                return le.A(cursor.getString(cursor.getColumnIndexOrThrow("mime_type"))) ? dchi.this.a(cursor) : new dchf(cursor);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        };
        lkrVar.P().c(new dchn(ejtrVar, new dchm(elbxVar, errlVar, ejvpVar)));
    }

    @Override // defpackage.dchj
    public final ejuh a() {
        return new dchq(this);
    }
}
