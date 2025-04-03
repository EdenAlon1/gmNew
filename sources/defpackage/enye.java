package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enye {
    public int b = 1;
    public String a = "";

    public final void a(int i, String str, Object... objArr) {
        this.b = i;
        this.a = String.format(str, objArr);
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i == 1) {
            return "OK";
        }
        switch (i) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "UNKNOWN";
                break;
            case 3:
                str = "UNIMPLEMENTED";
                break;
            case 4:
                str = "OUT_OF_RANGE";
                break;
            case 5:
                str = "INVALID_ARGUMENT";
                break;
            case 6:
                str = "FAILED_PRECONDITION";
                break;
            case 7:
                str = "INTERNAL";
                break;
            case 8:
                str = "DATA_LOSS";
                break;
            case 9:
                str = "RESOURCE_EXHAUSTED";
                break;
            case 10:
                str = "CANCELLED";
                break;
            case 11:
                str = "NOT_UNIT_LENGTH";
                break;
            case 12:
                str = "DUPLICATE_VERTICES";
                break;
            case 13:
                str = "ANTIPODAL_VERTICES";
                break;
            case 14:
                str = "NOT_CONTINUOUS";
                break;
            case 15:
                str = "INVALID_VERTEX";
                break;
            case 16:
                str = "LOOP_NOT_ENOUGH_VERTICES";
                break;
            case 17:
                str = "LOOP_SELF_INTERSECTION";
                break;
            case 18:
                str = "POLYGON_LOOPS_SHARE_EDGE";
                break;
            case 19:
                str = "POLYGON_LOOPS_CROSS";
                break;
            case 20:
                str = "POLYGON_EMPTY_LOOP";
                break;
            case 21:
                str = "POLYGON_EXCESS_FULL_LOOP";
                break;
            case 22:
                str = "POLYGON_INCONSISTENT_LOOP_ORIENTATIONS";
                break;
            case 23:
                str = "POLYGON_INVALID_LOOP_DEPTH";
                break;
            case 24:
                str = "POLYGON_INVALID_LOOP_NESTING";
                break;
            default:
                str = "null";
                break;
        }
        return String.format("%s: %s", str, this.a);
    }
}
