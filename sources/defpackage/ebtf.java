package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebtf {
    private final Context a;

    public ebtf(Context context) {
        this.a = context;
    }

    public static boolean b(ebtg ebtgVar) {
        return ((ebsw) ebtgVar).d;
    }

    public final Bitmap a(ebtg ebtgVar, int i) {
        emxf.b(i >= 0, "Size must be bigger or equal to 0");
        emxf.b(b(ebtgVar), "handles(key) must be true");
        ArrayList arrayList = new ArrayList();
        ebsw ebswVar = (ebsw) ebtgVar;
        String str = ebswVar.b;
        if (str != null) {
            arrayList.add(str);
        }
        if (i == 0) {
            i = 120;
        }
        arrayList.add(ebswVar.a);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        eftt efttVar = new eftt(new efua(this.a.getApplicationContext(), new erpq()));
        int[] iArr = eftu.a;
        eftv eftvVar = new eftv(efttVar);
        eeqm eeqmVar = efub.a;
        eftvVar.a(null);
        eftv.b(null);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        int b = eftv.b(ebswVar.a);
        CharSequence a = eftvVar.a(new ebte(strArr));
        Canvas canvas = new Canvas(createBitmap);
        int height = createBitmap.getHeight();
        int width = createBitmap.getWidth();
        Paint paint = (Paint) efub.a.a();
        synchronized (efub.a) {
            paint.setColor(b);
            int height2 = canvas.getHeight();
            int width2 = canvas.getWidth();
            canvas.drawCircle(width2 / 2, height2 / 2, Math.min(width2, height2) / 2, paint);
            if (a != null) {
                paint.setColor(-1);
                paint.setTextSize(Math.min(height, width) * 0.47f);
                paint.getTextBounds(a.toString(), 0, a.length(), efub.b);
                canvas.drawText(a, 0, a.length(), width / 2, (height / 2) - efub.b.exactCenterY(), paint);
            }
        }
        return createBitmap;
    }
}
