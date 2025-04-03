package com.google.android.ims.filetransfer.http.message;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.a;
import defpackage.diyy;
import defpackage.dizd;
import defpackage.dkty;
import j$.util.Objects;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FileInfo implements Serializable {
    static final diyy a = dizd.a(174969655);
    private static final String[] b = {"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS", "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mmZ", "yyyy-MM-dd'T'HH:mm"};
    private static final long serialVersionUID = 1648833636990854950L;
    public long mAudioDuration;
    public final String mBrandedUrl;
    public final String mContentType;
    public final String mFileName;
    public final long mSize;
    public final Type mType;
    public final String mUrl;
    public final Date mValidity;

    /* compiled from: PG */
    public enum Type {
        THUMBNAIL,
        FILE
    }

    private FileInfo(Type type, String str, long j, String str2, String str3, String str4, Date date, long j2) {
        this.mType = type;
        this.mFileName = str;
        this.mSize = j;
        this.mUrl = str2;
        this.mBrandedUrl = str3;
        this.mContentType = str4;
        this.mValidity = date;
        this.mAudioDuration = j2;
    }

    public static FileInfo a(XmlPullParser xmlPullParser) {
        Type type;
        long j;
        try {
            if (!e(xmlPullParser)) {
                throw new IOException("Parser not pointing to file info start tag. Expected file-info, but found " + xmlPullParser.getName());
            }
            String str = null;
            String attributeValue = xmlPullParser.getAttributeValue(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
            if (TextUtils.isEmpty(attributeValue)) {
                throw new IOException("Type attribute not found");
            }
            Type type2 = Type.THUMBNAIL;
            if ("thumbnail".equalsIgnoreCase(attributeValue)) {
                type = Type.THUMBNAIL;
            } else {
                if (!"file".equalsIgnoreCase(attributeValue)) {
                    throw new IOException("Unknown type: ".concat(String.valueOf(attributeValue)));
                }
                type = Type.FILE;
            }
            Type type3 = type;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Date date = null;
            long j2 = 0;
            long j3 = 0;
            String str5 = null;
            long j4 = 0;
            while (true) {
                if (xmlPullParser.getEventType() == 3) {
                    j = j3;
                    if ("file-info".equalsIgnoreCase(xmlPullParser.getName())) {
                        if (j4 <= j) {
                            throw new IOException(a.s(j4, "Illegal size: "));
                        }
                        if (TextUtils.isEmpty(str2)) {
                            throw new IOException("Illegal URL: ".concat(String.valueOf(str2)));
                        }
                        if (TextUtils.isEmpty(str4)) {
                            throw new IOException("Illegal content type: ".concat(String.valueOf(str4)));
                        }
                        return new FileInfo(type3, str5, j4, str2, str3, str4, date, j2);
                    }
                } else {
                    j = j3;
                }
                if (f(xmlPullParser) != 3) {
                    if ("file-size".equalsIgnoreCase(xmlPullParser.getName())) {
                        try {
                            j4 = Long.parseLong(g(xmlPullParser, "File size is invalid"));
                            j3 = j;
                        } catch (NumberFormatException e) {
                            throw new IOException("File size is invalid", e);
                        }
                    } else {
                        if ("file-name".equalsIgnoreCase(xmlPullParser.getName())) {
                            str5 = ((Boolean) a.a()).booleanValue() ? h(xmlPullParser) : g(xmlPullParser, "File name is empty");
                        } else if ("content-type".equalsIgnoreCase(xmlPullParser.getName())) {
                            str4 = g(xmlPullParser, "Content type is empty");
                        } else {
                            int i = 0;
                            if (GroupManagementRequest.DATA_TAG.equalsIgnoreCase(xmlPullParser.getName())) {
                                str2 = xmlPullParser.getAttributeValue(str, "url");
                                String attributeValue2 = xmlPullParser.getAttributeValue(str, "until");
                                if (TextUtils.isEmpty(attributeValue2)) {
                                    throw new IOException("Validity attribute not found");
                                }
                                String replace = attributeValue2.replace("Z", "+0000");
                                int indexOf = replace.indexOf(58, 19);
                                if (indexOf >= 0) {
                                    replace = String.valueOf(replace.substring(0, indexOf)).concat(String.valueOf(replace.substring(indexOf + 1)));
                                }
                                String str6 = replace;
                                String[] strArr = b;
                                while (true) {
                                    int length = strArr.length;
                                    if (i >= 6) {
                                        date = null;
                                        break;
                                    }
                                    try {
                                    } catch (Exception e2) {
                                        e = e2;
                                    }
                                    try {
                                        date = new SimpleDateFormat(strArr[i], Locale.US).parse(str6);
                                        break;
                                    } catch (Exception e3) {
                                        e = e3;
                                        int length2 = strArr.length;
                                        if (i == 5) {
                                            e.printStackTrace();
                                            i = 5;
                                        }
                                        i++;
                                    }
                                    i++;
                                }
                            } else if ("branded-url".equalsIgnoreCase(xmlPullParser.getName())) {
                                str3 = g(xmlPullParser, "Branded url is empty");
                            } else if ("playing-length".equalsIgnoreCase(xmlPullParser.getName())) {
                                try {
                                    j2 = Integer.parseInt(g(xmlPullParser, "Audio duration is invalid"));
                                } catch (NumberFormatException e4) {
                                    throw new IOException("Audio duration is invalid", e4);
                                }
                            } else {
                                dkty.q("Ignoring unknown tag: %s", xmlPullParser.getName());
                                xmlPullParser.next();
                            }
                        }
                        j3 = j;
                    }
                }
                j3 = j;
                str = null;
            }
        } catch (XmlPullParserException e5) {
            throw new IOException("Unable to parse file info", e5);
        }
    }

    public static boolean e(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2 && "file-info".equalsIgnoreCase(xmlPullParser.getName());
    }

    private static int f(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextTag();
        } catch (RuntimeException | XmlPullParserException unused) {
            throw new IOException("Invalid XML tag");
        }
    }

    private static String g(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.next() == 4) {
            return xmlPullParser.getText();
        }
        throw new IOException(str);
    }

    private static String h(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextText();
        } catch (RuntimeException | XmlPullParserException e) {
            throw new IOException("Error parsing file name.", e);
        }
    }

    public final void b(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-info");
        xmlSerializer.attribute("", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.mType == Type.THUMBNAIL ? "thumbnail" : "file");
        if (d()) {
            xmlSerializer.attribute("", "file-disposition", "render");
        }
        xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-size");
        xmlSerializer.text(Long.toString(this.mSize));
        xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-size");
        if (!Objects.isNull(this.mFileName)) {
            xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-name");
            xmlSerializer.text(this.mFileName);
            xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-name");
        }
        xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "content-type");
        xmlSerializer.text(this.mContentType);
        xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "content-type");
        xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", GroupManagementRequest.DATA_TAG);
        xmlSerializer.attribute("", "url", this.mUrl);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(b[3], Locale.US);
        if (!Objects.isNull(this.mValidity)) {
            xmlSerializer.attribute("", "until", simpleDateFormat.format(this.mValidity));
        }
        xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", GroupManagementRequest.DATA_TAG);
        if (d() && this.mAudioDuration > 0) {
            xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:rram", "playing-length");
            xmlSerializer.text(Long.toString(this.mAudioDuration));
            xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:rram", "playing-length");
        }
        xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-info");
    }

    public final boolean c() {
        Date date = this.mValidity;
        return (date == null || date.after(new Date())) ? false : true;
    }

    public final boolean d() {
        return this.mContentType.contains("audio");
    }

    public final String toString() {
        Date date = this.mValidity;
        return " Type: " + String.valueOf(this.mType) + "\n File name: " + this.mFileName + "\n Size: " + this.mSize + "\n Content type: " + this.mContentType + "\n Url: " + this.mUrl + "\n Branded Url: " + this.mBrandedUrl + "\n Validity: " + String.valueOf(date) + "\n audio duration: " + this.mAudioDuration;
    }
}
