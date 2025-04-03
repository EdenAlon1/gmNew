package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eace {
    private final dzyb g;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public int f = 0;
    public final Map a = new HashMap();
    public final SparseArray b = new SparseArray();

    public eace(dzyb dzybVar) {
        this.g = dzybVar;
    }

    protected final int a(dzqs dzqsVar) {
        char c = 65535;
        if (!fdql.h()) {
            if (dzqsVar.h().a() == 3) {
                String str = ((dznp) dzqsVar.h().b()).a;
                if (this.a.containsKey(str)) {
                    return ((Integer) this.a.get(str)).intValue();
                }
            }
            return dzqsVar.h().a() - 1;
        }
        int a = dzqsVar.h().a() - 1;
        if (a == 1) {
            return 4;
        }
        if (a != 2) {
            if (a == 3) {
                return 4;
            }
            throw new IllegalArgumentException("Unexpected messageContent type: ".concat(dzqh.a(dzqsVar.h().a())));
        }
        String str2 = ((dznp) dzqsVar.h().b()).a;
        int hashCode = str2.hashCode();
        if (hashCode != -1165975421) {
            if (hashCode == -989034367 && str2.equals("photos")) {
                c = 0;
            }
        } else if (str2.equals("link_preview")) {
            c = 1;
        }
        if (c == 0) {
            return 5;
        }
        if (c == 1) {
            return 6;
        }
        throw new IllegalArgumentException("Unsupported custom type: ".concat(((dznp) dzqsVar.h().b()).a));
    }

    protected final eacd b(ViewGroup viewGroup, int i) {
        String str;
        if (!fdql.h()) {
            if (this.b.get(i) != null) {
                return dzhf.a(viewGroup);
            }
            eabz eabzVar = new eabz(viewGroup.getContext());
            eabzVar.h = this.g;
            eabzVar.a = this.c;
            eabzVar.b = this.d;
            eabzVar.c = this.e;
            return new eacc(eabzVar);
        }
        int a = dzyg.a(i);
        if (a == 0) {
            throw null;
        }
        int i2 = a - 1;
        if (i2 != 4) {
            if (i2 != 5 && i2 != 6) {
                switch (a) {
                    case 1:
                        str = "SUGGESTION_LIST_CELL";
                        break;
                    case 2:
                        str = "RICH_CARD_BUBBLE_CELL";
                        break;
                    case 3:
                        str = "TOMBSTONE_BUBBLE_CELL";
                        break;
                    case 4:
                        str = "TYPING_INDICATOR_CELL";
                        break;
                    case 5:
                        str = "TEXT_MESSAGE_CONTENT";
                        break;
                    case 6:
                        str = "PHOTO_MESSAGE_CONTENT";
                        break;
                    case 7:
                        str = "LINK_PREVIEW_MESSAGE_CONTENT";
                        break;
                    case 8:
                        str = "SUGGESTION_CHIP_VIEW";
                        break;
                    case 9:
                        str = "STACK_CARD_VIEW";
                        break;
                    case 10:
                        str = "RICH_CARD_BUTTONS_UI_ELEMENT";
                        break;
                    case 11:
                        str = "RICH_TEXT_UI_ELEMENT";
                        break;
                    case 12:
                        str = "HORIZONTAL_LAYOUT_BUTTONS_UI_ELEMENT";
                        break;
                    case 13:
                        str = "IMAGE_ELEMENT_UI_ELEMENT";
                        break;
                    case 14:
                        str = "HORIZONTAL_LINE_UI_ELEMENT";
                        break;
                    case 15:
                        str = "STATUS_BADGE_UI_ELEMENT";
                        break;
                    case 16:
                        str = "VERTICAL_LAYOUT_BUTTON_VIEW";
                        break;
                    default:
                        str = "RICH_CARD_BUTTON_VIEW";
                        break;
                }
                throw new IllegalArgumentException("Unsupported view holder type: ".concat(str));
            }
            if (this.b.get(i2) != null) {
                return dzhf.a(viewGroup);
            }
        }
        eabz eabzVar2 = new eabz(viewGroup.getContext());
        eabzVar2.h = this.g;
        eabzVar2.a = this.c;
        eabzVar2.b = this.d;
        eabzVar2.c = this.e;
        return new eacc(eabzVar2);
    }
}
