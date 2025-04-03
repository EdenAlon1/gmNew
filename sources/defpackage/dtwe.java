package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Comparator;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtwe extends dtsf {
    static final Comparator a = Comparator.CC.naturalOrder();
    static final java.util.Comparator b = Comparator.CC.naturalOrder();
    static final java.util.Comparator c = Comparator.CC.naturalOrder();
    static final java.util.Comparator g = Comparator.CC.naturalOrder();
    static final java.util.Comparator h = Comparator.CC.naturalOrder();
    static final java.util.Comparator i = Comparator.CC.naturalOrder();
    private final Number j;
    private final int k;

    public dtwe(String str, int i2, Number number) {
        super(str);
        this.k = i2;
        this.j = number;
    }

    private static final int h(int i2) {
        if (i2 < 0) {
            return 3;
        }
        return i2 == 0 ? 1 : 2;
    }

    @Override // defpackage.duaw
    public final void a(dtzu dtzuVar, StringBuilder sb, List list) {
        if (dtzuVar.d) {
            sb.append('(');
            sb.append(f(dtzuVar.a()));
            sb.append(' ');
            sb.append(g(this.k));
            sb.append("?)");
            list.add(this.j.toString());
            return;
        }
        sb.append('(');
        sb.append(f(dtzuVar.a()));
        sb.append(' ');
        sb.append(g(this.k));
        sb.append(" ");
        sb.append(this.j);
        sb.append(")");
    }

    @Override // defpackage.duaw
    public final void b(dtzu dtzuVar, StringBuilder sb) {
        sb.append('(');
        sb.append(f(dtzuVar.a()));
        sb.append(' ');
        sb.append(g(this.k));
        sb.append(' ');
        sb.append(this.j);
        sb.append(')');
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ff  */
    @Override // defpackage.duaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean c(defpackage.dtyl r8, defpackage.duaw r9) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtwe.c(dtyl, duaw):boolean");
    }

    @Override // defpackage.duaw
    protected final boolean d(String str, ContentValues contentValues) {
        int h2;
        if (TextUtils.equals(str, this.e)) {
            String str2 = this.f;
            Number number = this.j;
            if (number instanceof Byte) {
                if (contentValues.get(str2) != null) {
                    h2 = h(a.compare(contentValues.getAsByte(str2), Byte.valueOf(this.j.byteValue())));
                }
                h2 = 4;
            } else if (number instanceof Short) {
                if (contentValues.get(str2) != null) {
                    h2 = h(b.compare(contentValues.getAsShort(str2), Short.valueOf(this.j.shortValue())));
                }
                h2 = 4;
            } else if (number instanceof Integer) {
                Object obj = contentValues.get(str2);
                if (obj != null) {
                    try {
                        h2 = h(c.compare(Integer.valueOf(this.j.intValue()), Integer.valueOf(obj instanceof Boolean ? ((Boolean) obj).booleanValue() ? 1 : 0 : ((Integer) obj).intValue())));
                    } catch (ClassCastException unused) {
                        Log.e("foobar", "ClassCastException retrieving column value for ".concat(String.valueOf(str2)));
                    }
                }
                h2 = 4;
            } else if (number instanceof Long) {
                if (contentValues.get(str2) != null) {
                    h2 = h(g.compare(contentValues.getAsLong(str2), Long.valueOf(this.j.longValue())));
                }
                h2 = 4;
            } else if (number instanceof Float) {
                if (contentValues.get(str2) != null) {
                    h2 = h(h.compare(contentValues.getAsFloat(str2), Float.valueOf(this.j.floatValue())));
                }
                h2 = 4;
            } else if (number instanceof Double) {
                if (contentValues.get(str2) != null) {
                    h2 = h(i.compare(contentValues.getAsDouble(str2), Double.valueOf(this.j.doubleValue())));
                }
                h2 = 4;
            }
            int i2 = this.k;
            if (h2 == 4) {
                return true;
            }
            int i3 = i2 - 1;
            if (i3 != 0) {
                if (i3 != 1) {
                    switch (i3) {
                        case 6:
                            if (h2 == 3) {
                                return false;
                            }
                            break;
                        case 7:
                            if (h2 == 2) {
                                return false;
                            }
                            break;
                        case 8:
                            if (h2 == 3 || h2 == 1) {
                                return false;
                            }
                            break;
                        case 9:
                            if (h2 == 2 || h2 == 1) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                } else if (h2 != 1) {
                    return false;
                }
            } else if (h2 == 1) {
                return false;
            }
            return true;
        }
        return false;
    }
}
