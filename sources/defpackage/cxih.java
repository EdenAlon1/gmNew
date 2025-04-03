package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxih extends cwuk {
    public final cxig a;
    private final elbx b;
    private final akzt c;
    private final int d;
    private cxhv[] e;

    public cxih(Context context, cxig cxigVar, elbx elbxVar, akzt akztVar, int i, String str) {
        super(context);
        this.a = cxigVar;
        this.b = elbxVar;
        this.c = akztVar;
        this.d = i;
        this.j = str;
    }

    public static CharSequence e(Context context, cxhv cxhvVar) {
        int ordinal = cxhvVar.ordinal();
        if (ordinal == 0) {
            return context.getString(R.string.action_off);
        }
        if (ordinal == 1) {
            return context.getString(R.string.action_archive);
        }
        if (ordinal == 2) {
            return context.getString(R.string.action_delete);
        }
        if (ordinal == 3) {
            return context.getString(R.string.action_mark_as_read_or_unread);
        }
        throw new UnsupportedOperationException("Unsupported Swipe action value");
    }

    @Override // defpackage.cwuk
    protected final void a(int i) {
        ekzm b = this.b.b("saveSwipeSetting");
        try {
            cxhv b2 = b();
            this.l = i;
            final cxhv b3 = b();
            if (b2 != b3) {
                this.c.e("Bugle.Settings.Swipe.Update.Count", b3.e);
            }
            if (this.d == R.string.swipe_left_key) {
                final cxig cxigVar = this.a;
                elfl.g(((effy) cxigVar.e.b()).b(new emwl() { // from class: cxia
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ejui ejuiVar = cxig.a;
                        cxht cxhtVar = (cxht) ((cxhw) obj).toBuilder();
                        cxhtVar.copyOnWrite();
                        cxhw cxhwVar = (cxhw) cxhtVar.instance;
                        cxhwVar.c = cxhv.this.e;
                        cxhwVar.b |= 1;
                        return (cxhw) cxhtVar.build();
                    }
                }, erpp.a)).h(new emwl() { // from class: cxib
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        cxig.this.c(cxig.b);
                        return null;
                    }
                }, erpp.a).k(axnw.b(), erpp.a);
            } else {
                final cxig cxigVar2 = this.a;
                elfl.g(((effy) cxigVar2.e.b()).b(new emwl() { // from class: cxhy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ejui ejuiVar = cxig.a;
                        cxht cxhtVar = (cxht) ((cxhw) obj).toBuilder();
                        cxhtVar.copyOnWrite();
                        cxhw cxhwVar = (cxhw) cxhtVar.instance;
                        cxhwVar.d = cxhv.this.e;
                        cxhwVar.b |= 2;
                        return (cxhw) cxhtVar.build();
                    }
                }, erpp.a)).h(new emwl() { // from class: cxhz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        cxig.this.c(cxig.c);
                        return null;
                    }
                }, erpp.a).k(axnw.b(), erpp.a);
            }
            d();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final cxhv b() {
        return this.e[this.l];
    }

    @Override // defpackage.cwuk
    protected final void c() {
        cxhv[] d = cxig.d();
        this.e = d;
        int length = d.length;
        CharSequence[] charSequenceArr = new CharSequence[4];
        int i = 0;
        while (true) {
            int length2 = d.length;
            if (i >= 4) {
                this.k = charSequenceArr;
                this.j = this.j;
                super.c();
                return;
            }
            charSequenceArr[i] = e(this.i, d[i]);
            i++;
        }
    }
}
