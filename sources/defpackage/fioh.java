package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fioh implements fira {
    private final char a;
    private int b = 0;
    private final LinkedList c = new LinkedList();

    public fioh(char c) {
        this.a = c;
    }

    @Override // defpackage.fira
    public final char a() {
        return this.a;
    }

    @Override // defpackage.fira
    public final char b() {
        return this.a;
    }

    @Override // defpackage.fira
    public final int c() {
        return this.b;
    }

    @Override // defpackage.fira
    public final int d(finj finjVar, finj finjVar2) {
        fira firaVar;
        int a = finjVar.a();
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                firaVar = (fira) this.c.getFirst();
                break;
            }
            firaVar = (fira) it.next();
            if (firaVar.c() <= a) {
                break;
            }
        }
        return firaVar.d(finjVar, finjVar2);
    }

    final void e(fira firaVar) {
        int c = firaVar.c();
        ListIterator listIterator = this.c.listIterator();
        while (listIterator.hasNext()) {
            fira firaVar2 = (fira) listIterator.next();
            int c2 = firaVar2.c();
            if (c > c2) {
                listIterator.previous();
                listIterator.add(firaVar);
                return;
            }
            if (c == c2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + c + "; conflicting processors: " + String.valueOf(firaVar2) + ", " + String.valueOf(firaVar));
            }
        }
        this.c.add(firaVar);
        this.b = c;
    }
}
