package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dull extends fy {
    private final List a;
    private int b;

    public dull(fr frVar, List list, int i) {
        super(frVar);
        this.b = 0;
        if (list == null) {
            throw new NullPointerException("Questions were missing!");
        }
        this.a = list;
        this.b = i;
    }

    public static int m(ea eaVar) {
        return eaVar.m.getInt("QuestionIndex", -1);
    }

    @Override // defpackage.fy
    public final ea b(int i) {
        ea dukwVar;
        euka eukaVar = (euka) this.a.get(i);
        int i2 = eukaVar.d;
        int b = euki.b(i2);
        if (b == 0) {
            b = 1;
        }
        int i3 = b - 2;
        if (i3 == 1) {
            int i4 = this.b;
            dukwVar = new dukw();
            dukwVar.at(dukw.a(eukaVar, i4, i));
        } else if (i3 == 2) {
            int i5 = this.b;
            dukwVar = new dukz();
            dukwVar.at(dukz.a(eukaVar, i5, i));
        } else if (i3 == 3) {
            int i6 = this.b;
            dukwVar = new dulc();
            dukwVar.at(dulc.a(eukaVar, i6, i));
        } else {
            if (i3 != 4) {
                int b2 = euki.b(i2);
                if (b2 == 0) {
                    b2 = 1;
                }
                throw new AssertionError(String.format("Attempted to build fragment for unsupported Question type %s.  Note this should never happen as it's invalid to create a Question type that does not have a matching fragment.", Integer.toString(euki.a(b2))));
            }
            int i7 = this.b;
            dukwVar = new dule();
            dukwVar.at(dule.a(eukaVar, i7, i));
        }
        dukwVar.m.putInt("QuestionIndex", i);
        return dukwVar;
    }

    @Override // defpackage.pco
    public final int j() {
        return this.a.size();
    }
}
