package defpackage;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qx {
    private final EditText a;
    private final lhm b;

    public qx(EditText editText) {
        this.a = editText;
        this.b = new lhm(editText);
    }

    static final boolean c(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    static final KeyListener d(KeyListener keyListener) {
        if (c(keyListener) && !(keyListener instanceof lhr)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof NumberKeyListener)) {
                return new lhr(keyListener);
            }
        }
        return keyListener;
    }

    final InputConnection a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof lho) ? new lho(this.b.a, inputConnection, editorInfo) : inputConnection;
    }

    final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, kt.j, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            lhx lhxVar = this.b.b;
            if (lhxVar.c != z) {
                if (lhxVar.b != null) {
                    lgl c = lgl.c();
                    lgg lggVar = lhxVar.b;
                    ksw.i(lggVar, "initCallback cannot be null");
                    c.c.writeLock().lock();
                    try {
                        ArrayList arrayList = new ArrayList();
                        cmi cmiVar = new cmi((cmj) c.d);
                        while (cmiVar.hasNext()) {
                            lgj lgjVar = (lgj) cmiVar.next();
                            if (lgjVar.a == lggVar) {
                                arrayList.add(lgjVar);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            c.d.remove((lgj) it.next());
                        }
                    } finally {
                        c.c.writeLock().unlock();
                    }
                }
                lhxVar.c = z;
                if (z) {
                    lhx.a(lhxVar.a, lgl.c().b());
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
