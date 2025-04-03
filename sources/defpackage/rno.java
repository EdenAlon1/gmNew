package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rno implements Cloneable {
    public rmg a;
    public boolean b;
    public boolean c;
    public Paint d;
    public Paint e;
    public rle f;
    public rle g;
    public boolean h;
    public boolean i;

    public rno() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(385);
        this.d.setStyle(Paint.Style.FILL);
        this.d.setTypeface(Typeface.DEFAULT);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(385);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setTypeface(Typeface.DEFAULT);
        this.a = rmg.a();
    }

    protected final Object clone() {
        try {
            rno rnoVar = (rno) super.clone();
            rnoVar.a = (rmg) this.a.clone();
            rnoVar.d = new Paint(this.d);
            rnoVar.e = new Paint(this.e);
            return rnoVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
