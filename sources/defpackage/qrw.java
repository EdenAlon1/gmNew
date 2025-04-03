package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qrw implements ffxy {
    final /* synthetic */ qry a;

    public qrw(qry qryVar) {
        this.a = qryVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        Drawable drawable;
        Object obj2;
        qsr qsrVar = (qsr) obj;
        if (qsrVar instanceof qsv) {
            drawable = (Drawable) ((qsv) qsrVar).a;
        } else {
            if (!(qsrVar instanceof qst)) {
                throw new ffcd();
            }
            drawable = ((qst) qsrVar).a;
        }
        if (drawable == null) {
            obj2 = null;
        } else if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            bitmap.getClass();
            obj2 = new igo(new iax(bitmap));
        } else if (drawable instanceof ColorDrawable) {
            obj2 = new igp(iby.c(((ColorDrawable) drawable).getColor()));
        } else {
            Drawable mutate = drawable.mutate();
            mutate.getClass();
            obj2 = new rux(mutate);
        }
        qry qryVar = this.a;
        Object j = qryVar.j();
        if (obj2 != j) {
            hjk hjkVar = j instanceof hjk ? (hjk) j : null;
            if (hjkVar != null) {
                hjkVar.h();
            }
            hjk hjkVar2 = obj2 instanceof hjk ? (hjk) obj2 : null;
            if (hjkVar2 != null) {
                hjkVar2.i();
            }
            qryVar.d.b(drawable);
            qryVar.e.b(obj2);
        }
        this.a.c.b(qsrVar.a());
        return ffcu.a;
    }
}
