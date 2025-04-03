package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Looper;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npr implements npb {
    public final Context a;
    public final npm b;
    public final ltn c;
    public final ltm d;
    public npb e;
    public npb f;

    public npr(Context context, npm npmVar, ltn ltnVar) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        this.a = context.getApplicationContext();
        this.b = npmVar;
        this.c = ltnVar;
        int i = lvf.a;
        BitmapFactory.Options options = new BitmapFactory.Options();
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        options.inPreferredColorSpace = colorSpace;
        this.d = new lwq(errs.a(Executors.newSingleThreadExecutor()), new lww(context), options);
    }

    @Override // defpackage.npb
    public final npd a(nql nqlVar, Looper looper, npc npcVar, npa npaVar) {
        throw null;
    }
}
