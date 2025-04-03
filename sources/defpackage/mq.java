package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mq {
    private final List a;
    private final int[] b;
    private final int[] c;
    private final mo d;
    private final int e;
    private final int f;

    public mq(mo moVar, List list, int[] iArr, int[] iArr2) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = moVar;
        int b = moVar.b();
        this.e = b;
        int a = moVar.a();
        this.f = a;
        mp mpVar = list.isEmpty() ? null : (mp) list.get(0);
        if (mpVar == null || mpVar.a != 0 || mpVar.b != 0) {
            list.add(0, new mp(0, 0, 0));
        }
        list.add(new mp(b, a, 0));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mp mpVar2 = (mp) it.next();
            for (int i = 0; i < mpVar2.c; i++) {
                int i2 = mpVar2.a + i;
                int i3 = mpVar2.b + i;
                int i4 = true != this.d.d(i2, i3) ? 2 : 1;
                this.b[i2] = (i3 << 4) | i4;
                this.c[i3] = (i2 << 4) | i4;
            }
        }
        int i5 = 0;
        for (mp mpVar3 : this.a) {
            while (i5 < mpVar3.a) {
                if (this.b[i5] == 0) {
                    int size = this.a.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i6 < size) {
                            mp mpVar4 = (mp) this.a.get(i6);
                            while (i7 < mpVar4.b) {
                                if (this.c[i7] == 0 && this.d.e(i5, i7)) {
                                    int i8 = true != this.d.d(i5, i7) ? 4 : 8;
                                    this.b[i5] = (i7 << 4) | i8;
                                    this.c[i7] = i8 | (i5 << 4);
                                } else {
                                    i7++;
                                }
                            }
                            i7 = mpVar4.b();
                            i6++;
                        }
                    }
                }
                i5++;
            }
            i5 = mpVar3.a();
        }
    }

    private static ms d(Collection collection, int i, boolean z) {
        ms msVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                msVar = null;
                break;
            }
            msVar = (ms) it.next();
            if (msVar.a == i && msVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            ms msVar2 = (ms) it.next();
            if (z) {
                msVar2.b--;
            } else {
                msVar2.b++;
            }
        }
        return msVar;
    }

    public final int a(int i) {
        if (i >= 0 && i < this.e) {
            int i2 = this.b[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }
        throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.e);
    }

    public final void b(mw mwVar) {
        int i;
        mm mmVar = mwVar instanceof mm ? (mm) mwVar : new mm(mwVar);
        int i2 = this.e;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = this.e;
        int i4 = this.f;
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                mmVar.e();
                return;
            }
            mp mpVar = (mp) this.a.get(size);
            int a = mpVar.a();
            int b = mpVar.b();
            while (true) {
                if (i3 <= a) {
                    break;
                }
                i3--;
                int i5 = this.b[i3];
                if ((i5 & 12) != 0) {
                    int i6 = i5 >> 4;
                    ms d = d(arrayDeque, i6, false);
                    if (d != null) {
                        int i7 = (i2 - d.b) - 1;
                        mmVar.c(i3, i7);
                        if ((i5 & 4) != 0) {
                            mmVar.a(i7, 1, this.d.c(i3, i6));
                        }
                    } else {
                        arrayDeque.add(new ms(i3, (i2 - i3) - 1, true));
                    }
                } else {
                    mmVar.d(i3, 1);
                    i2--;
                }
            }
            while (i4 > b) {
                i4--;
                int i8 = this.c[i4];
                if ((i8 & 12) != 0) {
                    int i9 = i8 >> 4;
                    if (d(arrayDeque, i9, true) == null) {
                        arrayDeque.add(new ms(i4, i2 - i3, false));
                    } else {
                        mmVar.c((i2 - r11.b) - 1, i3);
                        if ((i8 & 4) != 0) {
                            mmVar.a(i3, 1, this.d.c(i9, i4));
                        }
                    }
                } else {
                    mmVar.b(i3, 1);
                    i2++;
                }
            }
            int i10 = mpVar.a;
            int i11 = mpVar.b;
            for (i = 0; i < mpVar.c; i++) {
                if ((this.b[i10] & 15) == 2) {
                    mmVar.a(i10, 1, this.d.c(i10, i11));
                }
                i10++;
                i11++;
            }
            i3 = mpVar.a;
            i4 = mpVar.b;
        }
    }

    public final void c(vk vkVar) {
        b(new ml(vkVar));
    }
}
