package defpackage;

import android.graphics.Picture;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnh {
    public static final /* synthetic */ int e = 0;
    public rmh a = null;
    public final float b = 96.0f;
    public final rkw c = new rkw();
    final Map d = new HashMap();

    static {
        new DecimalFormat("#.0000");
        new cnq(10);
    }

    protected rnh() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final rmn d(rml rmlVar, String str) {
        rmn d;
        rmn rmnVar = (rmn) rmlVar;
        if (str.equals(rmnVar.o)) {
            return rmnVar;
        }
        for (Object obj : rmlVar.n()) {
            if (obj instanceof rmn) {
                rmn rmnVar2 = (rmn) obj;
                if (str.equals(rmnVar2.o)) {
                    return rmnVar2;
                }
                if ((obj instanceof rml) && (d = d((rml) obj, str)) != null) {
                    return d;
                }
            }
        }
        return null;
    }

    protected final rmp a(String str) {
        String substring;
        if (str == null || str.length() <= 1 || !str.startsWith("#") || (substring = str.substring(1)) == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(this.a.o)) {
            return this.a;
        }
        if (this.d.containsKey(substring)) {
            return (rmp) this.d.get(substring);
        }
        rmn d = d(this.a, substring);
        this.d.put(substring, d);
        return d;
    }

    public final Picture b(int i, int i2) {
        Picture picture = new Picture();
        rns rnsVar = new rns(picture.beginRecording(i, i2), new rle(0.0f, 0.0f, i, i2));
        rnsVar.c = this;
        rmh rmhVar = this.a;
        if (rmhVar == null) {
            rns.h("Nothing to render. Document is empty.", new Object[0]);
        } else {
            rnsVar.d = new rno();
            rnsVar.e = new Stack();
            rnsVar.g(rnsVar.d, rmg.a());
            rno rnoVar = rnsVar.d;
            rnoVar.f = rnsVar.b;
            rnoVar.h = false;
            rnoVar.i = false;
            rnsVar.e.push(rnoVar.clone());
            new Stack();
            new Stack();
            rnsVar.g = new Stack();
            rnsVar.f = new Stack();
            rnsVar.d(rmhVar);
            rnsVar.f(rmhVar, rmhVar.c, rmhVar.d, rmhVar.w, rmhVar.v);
        }
        picture.endRecording();
        return picture;
    }

    public final rle c() {
        int i;
        float f;
        int i2;
        rmh rmhVar = this.a;
        rlr rlrVar = rmhVar.c;
        rlr rlrVar2 = rmhVar.d;
        if (rlrVar != null && !rlrVar.f() && (i = rlrVar.b) != 9 && i != 2 && i != 3) {
            float g = rlrVar.g();
            if (rlrVar2 == null) {
                rle rleVar = rmhVar.w;
                f = rleVar != null ? (rleVar.d * g) / rleVar.c : g;
            } else if (!rlrVar2.f() && (i2 = rlrVar2.b) != 9 && i2 != 2 && i2 != 3) {
                f = rlrVar2.g();
            }
            return new rle(0.0f, 0.0f, g, f);
        }
        return new rle(-1.0f, -1.0f, -1.0f, -1.0f);
    }
}
